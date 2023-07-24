import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] dp;
        for(int tc = 1; tc <= t; tc++) {
            String keys = sc.next();
            dp = new int[keys.length()][16];
            first_day(keys, dp);
            for(int i = 1; i < keys.length(); i++) {
                other_day(keys, dp, i);
            }
            int ans = sol(dp);
            System.out.println("#" + tc + " " + ans);
        }
        sc.close();
    }

    public static void first_day(String keys, int[][] dp) {
        int key = 1 << (keys.charAt(0) - 'A');
        for(int i = 1; i < 16; i++) {
            if((i & key) != 0 && (i & 1) != 0) {
                dp[0][i] = 1;
            }
        }
    }

    public static void other_day(String keys, int[][] dp, int day) {
        int key = 1 << (keys.charAt(day) - 'A');
        for(int i = 1; i < 16; i++) {
            if(dp[day - 1][i] != 0) {
                for(int j = 1; j < 16; j++) {
                    if((j & i) != 0 && (j & key) != 0) {
                        dp[day][j] += dp[day - 1][i];
                        dp[day][j] %= 1000000007;
                    }
                }
            }
        }
    }

    public static int sol(int[][] dp) {
        int sum = 0;
        for(int i = 1; i < 16; i++) {
            sum += dp[dp.length - 1][i];
            sum %= 1000000007;
        }
        return sum;
    }
}