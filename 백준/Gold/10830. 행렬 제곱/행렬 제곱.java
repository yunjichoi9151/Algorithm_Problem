import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long b = sc.nextLong();
        int[][] arr = new int[n][n];
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            res[i][i] = 1;
        }
        while(b > 0) {
            if(b % 2 == 1) {
                res = calculate(res, arr);
            }
            arr = calculate(arr, arr);
            b /= 2;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static int[][] calculate(int[][] matrix1, int[][]matrix2) {
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                    result[i][j] %= 1000;
                }
            }
        }
        return result;
    }
}