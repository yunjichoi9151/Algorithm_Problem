import java.util.Scanner;

public class Main {
    public static int n = 0;
    public static int k = 0;
    private static long ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        long left = 1;
        long right = k;
        System.out.println(binary_search(left, right));
    }
    private static long binary_search(long left, long right) {
        int cnt = 0;
        long mid = (left + right) / 2;
        if(left > right) {
            return ans;
        }
        for(int i = 1; i <= n; i++) {
            cnt += Math.min(mid / i, n);
        }
        if(k > cnt) {
            return binary_search(mid + 1, right);
        }
        else {
            ans = mid;
            return binary_search(left, mid - 1);
        }
    }
}