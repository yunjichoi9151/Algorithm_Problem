import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long ans = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int num : arr) {
            if(num <= b) {
                ans += 1;
            } else {
                if(num - b >= c) {
                    ans += (num - b) / c + ((num - b) % c == 0 ? 1 : 2);
                } else {
                    ans += 2;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}