import java.util.Scanner;

public class Main {

    public static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b / gcd(a, b));
        }
        sc.close();
    }
    
}