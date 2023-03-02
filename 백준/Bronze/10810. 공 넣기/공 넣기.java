import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int r = 0; r < m; r++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int s = i - 1; s < j; s++) {
                arr[s] = k;
            }
        }
        for(int r = 0; r < n; r++) {
            System.out.print(arr[r] + " ");
        }
        sc.close();
    }
}