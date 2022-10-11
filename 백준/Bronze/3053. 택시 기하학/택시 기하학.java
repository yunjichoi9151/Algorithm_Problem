import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("%.6f", (3.14159265359 * r * r));
        System.out.println();
        System.out.printf("%.6f", (2.0 * r * r));
        sc.close();
    }
}