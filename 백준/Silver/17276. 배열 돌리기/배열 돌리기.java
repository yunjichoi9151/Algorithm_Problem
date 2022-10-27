import java.util.Scanner;

public class Main {
    static int[][] arr1;
    static int[][] arr2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt(), d = sc.nextInt();
            arr1 = new int[n][n];
            arr2 = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            if(d == 0 || Math.abs(d) == 360) {
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        System.out.print(arr1[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            else {
                if(d < 0) {
                    d += 360;
                }
                for(int k = 0; k < d / 45; k++) {
                    rotate_45(n);
                }
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        System.out.print(arr2[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void rotate_45(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    arr2[i][j] = arr1[n / 2][j];
                }
                else if(j == n / 2) {
                    arr2[i][j] = arr1[i][i];
                }
                else if(i + j == n - 1) {
                    arr2[i][j] = arr1[i][n / 2];
                }
                else if(i == n / 2) {
                    arr2[i][j] = arr1[n - 1 - j][j];
                }
                else {
                    arr2[i][j] = arr1[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr1[i][j] = arr2[i][j];
            }
        }
    }
}