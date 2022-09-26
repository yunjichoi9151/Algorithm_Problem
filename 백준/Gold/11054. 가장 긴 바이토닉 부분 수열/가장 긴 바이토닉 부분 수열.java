import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp1[i] = 1;
            dp2[i] = 1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && dp1[i] <= dp1[j]) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }
        for(int i = n - 1; i >= 0; i--) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j] && dp2[j] >= dp2[i]) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        int res = dp1[0] + dp2[0] - 1;
        for(int i = 0; i < n; i++) {
            res = Math.max(res, dp1[i] + dp2[i]);
        }
        System.out.println(res - 1);
        sc.close();
    }
}