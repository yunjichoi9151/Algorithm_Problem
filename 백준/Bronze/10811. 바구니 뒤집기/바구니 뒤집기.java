import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int k = 0; k < n; k++) {
            arr[k] = k + 1;
            arr2[k] = k + 1;
        }
        for(int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tmp = j;
            for(int r = i - 1; r < j; r++) {
                arr2[r] = arr[tmp - 1];
                tmp--;
            }
            for(int r = 0; r < n; r++) {
                arr[r] = arr2[r];
            }
        }
        for(int k = 0; k < n; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
}