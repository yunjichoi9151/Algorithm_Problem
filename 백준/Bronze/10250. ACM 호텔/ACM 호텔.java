import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0, b = 0;
        for(int tc = 1; tc <= t; tc++) {
            int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
            if(n % h != 0) {
                a = n % h;
                b = n / h + 1;
            }
            else if(n % h == 0) {
                a = h;
                b = n / h;
            }
            System.out.printf("%d%02d", a, b);
            System.out.println();
        }
        sc.close();
    }
}