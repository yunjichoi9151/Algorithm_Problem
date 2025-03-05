import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num != 1) ans++;
            for(int j = 2; j <= num / j; j++) {
                if(num % j == 0) {
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
