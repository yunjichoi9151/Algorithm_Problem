import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        int[] dp = new int[k + 1];

        for(int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for(int i = 1; i <= n; i++) {
            for(int j = k; j - w[i] >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
        System.out.println(dp[k]);
        sc.close();
    }
}