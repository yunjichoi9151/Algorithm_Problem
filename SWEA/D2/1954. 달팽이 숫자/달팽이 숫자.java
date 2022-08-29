import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int print = n;
            int k = 1;
            int right = -1;
            int bottom = 0;
            int top = 1;
            int[][] snail = new int[n][n];
            for(int i = n; i > 0; i--) {
                for(int j = 0; j < print; j++) {
                    right += top;
                    snail[bottom][right] = k;
                    k++;
                }
                print--;
                for(int j = 0; j < print; j++) {
                    bottom += top;
                    snail[bottom][right] = k;
                    k++;
                }
                top *= -1;
            }
            System.out.println("#" + tc);
            for(int i = 0; i < snail.length; i++) {
                for(int j = 0; j < snail.length; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}