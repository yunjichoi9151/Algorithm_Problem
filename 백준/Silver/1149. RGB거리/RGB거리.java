import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][3];
        for(int i = 0; i < n; i++) {
            int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
            if(i > 0) {
                dp[i][0] = r + Math.min(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = g + Math.min(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = b + Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
            else {
                dp[i][0] = r;
                dp[i][1] = g;
                dp[i][2] = b;
            }
        }
        System.out.println(Math.min(Math.min(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
        sc.close();
    }
}