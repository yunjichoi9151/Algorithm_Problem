import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            System.out.println(br.readLine());
            return;
        }
        int[] score = new int[N + 1];
        int[] dp = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        for(int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }
        System.out.println(dp[N]);
    }
}
