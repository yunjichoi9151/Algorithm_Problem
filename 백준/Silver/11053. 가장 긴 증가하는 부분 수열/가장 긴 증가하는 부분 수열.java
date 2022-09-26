import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = -1;
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
            if(dp[i] > res) {
                res = dp[i];
            }
        }
        System.out.println(res);
    }
}