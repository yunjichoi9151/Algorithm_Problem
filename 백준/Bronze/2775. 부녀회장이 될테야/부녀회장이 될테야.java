import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[][] arr = new int[15][15];
        for(int i = 0; i < 15; i++) {
            arr[0][i] = i;
            arr[i][1] = 1;
        }
        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                for(int r = 1; r <= j; r++) {
                    arr[i][j] += arr[i - 1][r];
                }
            }
        }
        for(int t = 0; t < tc; t++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
        sc.close();
    }
}