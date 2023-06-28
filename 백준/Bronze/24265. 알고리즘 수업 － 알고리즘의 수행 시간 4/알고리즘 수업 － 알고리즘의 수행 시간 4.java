import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for(long i = n - 1; i > 0; i--) {
            ans += i;
        }
        System.out.println(ans + "\n" + 2);
        sc.close();
    }
}