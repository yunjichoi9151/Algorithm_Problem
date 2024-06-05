import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        boolean[] check = new boolean[N];
        int ans = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == 'P') {
                int min = Math.max(0, i - K);
                int max = Math.min(N - 1, i + K);
                for(int j = min; j <= max; j++) {
                    if(arr[j] == 'H' && !check[j]) {
                        check[j] = true;
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}