import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[16];
        arr[0] = 4;
        int tmp = 2;
        for(int i = 1; i <= n; i++) {
            arr[i] = (2 * tmp - 1) * (2 * tmp - 1);
            tmp = 2 * tmp - 1;
        }
        System.out.println(arr[n]);
        sc.close();
    }
}