import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] rgb = new int[n][3];
        int[][] dp = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                rgb[i][j] = sc.nextInt();
				dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = rgb[0][0];
        dp[0][1] = rgb[0][1];
        dp[0][2] = rgb[0][2];
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(j != k) {
                        dp[i][k] = Math.min(dp[i][k], dp[i - 1][j] + rgb[i][k]);
                    }
                }
            }
        }
        System.out.println(Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
        sc.close();
    }
}