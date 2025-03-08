import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 1;
        if(K == 0) {
            System.out.println("1");
            return;
        } else if(N / 2 < K) K = N - K;
        for(int i = 0; i < K; i++) {
            ans = ans * (N - i);
        }
        for(int i = 0; i < K; i++) {
            ans = ans / (K - i);
        }
        System.out.println(ans);
    }
}
