import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int ans = 0;
        for(int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        for(int i = 0; i < 6; i++) {
            if(arr[i] % T == 0) {
                ans += arr[i] / T;
            } else {
                ans += arr[i] / T + 1;
            }
        }
        System.out.println(ans + "\n" + (N / P) + " " + (N % P));
    }
}
