import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while(a != 0 && b != 0 && c != 0) {
            if(2 * Math.max(Math.max(a, b), c) < (a + b + c)) {
                if(a == b && b == c) {
                    System.out.println("Equilateral");
                } else if(a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        sc.close();
    }
}