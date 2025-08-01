import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            System.out.println(1);
            return;
        }
        int[] dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }
        System.out.println(dp[N]);
    }
}
