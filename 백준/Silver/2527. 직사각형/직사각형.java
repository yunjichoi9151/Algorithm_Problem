import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 4; tc++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt();
            int x3 = sc.nextInt(), y3 = sc.nextInt();
            int x4 = sc.nextInt(), y4 = sc.nextInt();
            if((x2 == x3 || x1 == x4) && (y2 == y3 || y1 == y4)) {
                System.out.println("c");
            }
            else if((x2 < x3) || (x1 > x4) || (y2 < y3) || (y1 > y4)) {
                System.out.println("d");
            }
            else if((y2 == y3) || (y1 == y4) || (x2 == x3) || (x1 == x4)) {
                System.out.println("b");
            }
            else {
                System.out.println("a");
            }
        }
        sc.close();
    }
}