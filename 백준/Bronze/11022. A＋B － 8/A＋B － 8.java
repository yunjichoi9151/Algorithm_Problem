import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + tc + ": " + a + " + " + b + " = " + (a + b));
        }
        sc.close();
    }
}