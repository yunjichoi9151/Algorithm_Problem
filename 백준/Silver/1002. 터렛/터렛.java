import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            if(r1 == r2 && d == 0) {
                System.out.println(-1);
            }
            else if(Math.abs(r2 - r1) > d || r1 + r2 < d || d == 0) {
                System.out.println(0);
            }
            else if(Math.abs(r2 - r1) == d || r1 + r2 == d) {
                System.out.println(1);
            }
            else if(d > Math.abs(r2 - r1) && d < r1 + r2) {
                System.out.println(2);
            }
        }
        sc.close();
    }
}