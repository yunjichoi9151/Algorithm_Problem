import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        long[][][] dp = new long[n][n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dp[0][1][0] = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 2; j < n; j++) {
                if(map[i][j] == 1) {
                    continue;
                }
                dp[i][j][0] = dp[i][j - 1][0] + dp[i][j - 1][2];
                if(i >= 1) {
                    dp[i][j][1] = dp[i - 1][j][1] + dp[i - 1][j][2];
                    if(map[i][j - 1] == 0 && map[i - 1][j] == 0) {
                        dp[i][j][2] = dp[i - 1][j - 1][0] + dp[i - 1][j - 1][1] + dp[i - 1][j - 1][2];
                    }
                }
            }
        }
        System.out.println(dp[n - 1][n - 1][0] + dp[n - 1][n - 1][1] + dp[n - 1][n - 1][2]);
        sc.close();
    }
}