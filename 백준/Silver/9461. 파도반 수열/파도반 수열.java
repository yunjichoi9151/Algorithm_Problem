import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        int[] tmp = {1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
            for(int i = 1; i <= 10; i++) {
                dp[i] = tmp[i - 1];
            }
            for(int i = 11; i <= 100; i++) {
                dp[i] = dp[i - 1] + dp[i - 5];
            }
        for(int tc = 0; tc < T; tc++) {
            sb.append(dp[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.print(sb);
    }
}