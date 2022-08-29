import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int[][] arr1 = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + tc);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(arr1[n - 1 - j][i]);
                }
                System.out.print(" ");
                for(int j = 0; j < n; j++) {
                    System.out.print(arr1[n - 1 - i][n - 1 - j]);
                }
                System.out.print(" ");
                for(int j = 0; j < n; j++) {
                    System.out.print(arr1[j][n - 1 - i]);
                }
                System.out.println();
            }
        }
    }
}