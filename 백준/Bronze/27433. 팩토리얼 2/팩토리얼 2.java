import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 1;
        if(n != 0) {
            for(long i = 1; i <= n; i++) {
                ans *= i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}