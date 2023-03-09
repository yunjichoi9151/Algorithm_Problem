import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1 = sc.nextInt(), q1 = sc.nextInt(), p2 = sc.nextInt(), q2 = sc.nextInt();
        System.out.println((p1 * p2 % (q1 * q2 * 2) == 0) ? 1 : 0);
    }
}
