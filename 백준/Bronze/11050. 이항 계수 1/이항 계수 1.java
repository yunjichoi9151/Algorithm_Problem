import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int num1 = 1, num2 = 1, num3 = 1;
        for(int i = 1; i <= n; i++) {
            num1 *= i;
        }
        for(int i = 1; i <= k; i++) {
            num2 *= i;
        }
        for(int i = 1; i <= n - k; i++) {
            num3 *= i;
        }
        System.out.println(num1 / (num2 * num3));
    }
}