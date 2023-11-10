import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b, (n1, n2) -> n1 - n2);
        Arrays.sort(a, (n1, n2) -> n2 - n1);
        for(int i = 0; i < n; i++) {
            ans += a[i] * b[i];
        }
        System.out.println(ans);
        sc.close();
    }
}