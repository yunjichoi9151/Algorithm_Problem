import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int k = 0; k < n; k++) {
            arr[k] = k + 1;
        }
        for(int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tmp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = tmp;
        }
        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}