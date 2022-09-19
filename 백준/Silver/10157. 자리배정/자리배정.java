import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), r = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] arr = new int[r + 1][c + 1];
        if(c * r < n1) {
            System.out.println(0);
            System.exit(0);
        }
        int c1 = c, r1 = r, k = 1, right = 1, bottom = 0, top = 1;
        outerLoop:
        for(int i = 1; i <= c1; i++) {
            for(int j = 1; j <= r; j++) {
                bottom += top;
                arr[r - bottom + 1][right] = k;
                if(k == n1) {
                    System.out.println(right + " " + (r1 - (r - bottom)));
                    break outerLoop;
                }
                k++;
            }
            c--;
            for(int j = 1; j <= c; j++) {
                right += top;
                arr[r - bottom + 1][right] = k;
                if(k == n1) {
                    System.out.println(right + " " + (r1 - (r - bottom)));
                    break outerLoop;
                }
                k++;
            }
            r--;
            bottom--;
            top *= -1;
        }
        sc.close();
    }
}