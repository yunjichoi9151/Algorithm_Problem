import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a * b;
        while(b > 0) {
            System.out.println(a * (b % 10));
            b /= 10;
        }
        System.out.println(ans);
        sc.close();
    }
}