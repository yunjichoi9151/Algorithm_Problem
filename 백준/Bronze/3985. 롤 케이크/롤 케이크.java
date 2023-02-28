import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), n = sc.nextInt();
        int[] arr = new int[l];
        int max1 = 0, max2 = 0, ans1 = 0, ans2 = 0;
        for(int i = 0; i < n; i++) {
            int p = sc.nextInt(), k = sc.nextInt();
            for(int j = p - 1; j < k; j++) {
                if(arr[j] == 0) {
                    arr[j] = i + 1;
                }
            }
            if(max1 < k - p) {
                max1 = k - p;
                ans1 = i + 1;
            }
        }
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < l; j++) {
                if(arr[j] == i + 1) {
                    cnt++;
                }
            }
            if(max2 < cnt) {
                max2 = cnt;
                ans2 = i + 1;
            }
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
}