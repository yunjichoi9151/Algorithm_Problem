import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c) {
            System.out.println(a * 3);
        } else if(a == b || b == c || c == a) {
            if(a == b) {
                if(a + b > c) {
                    System.out.println(2 * a + c);
                } else {
                    System.out.println(4 * a - 1);
                }
            } else if(b == c) {
                if(b + c > a) {
                    System.out.println(a + 2 * b);
                } else {
                    System.out.println(4 * b - 1);
                }
            } else {
                if(c + a > b) {
                    System.out.println(b + 2 * c);
                } else {
                    System.out.println(4 * c - 1);
                }
            }
        } else {
            if(2 * Math.max(Math.max(a, b), c) < (a + b + c)) {
                System.out.println(a + b + c);
            } else {
                System.out.println(2 * ((a + b + c) - Math.max(Math.max(a, b), c)) - 1);
            }
        }
        sc.close();
    }
}