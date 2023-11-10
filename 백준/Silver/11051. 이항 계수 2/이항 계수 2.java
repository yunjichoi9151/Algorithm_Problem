import java.util.Scanner;

public class Main {
    public static int div = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println((fac(n) * mod_inverse((fac(n - k) * fac(k)) % div, div - 2)) % div);
        sc.close();
    }

    static int fac(int n) {
        if(n <= 1) return 1;
        return (n * fac(n - 1)) % div;
    }

    static int mod_inverse(int a, int p) {
        int ret = 1;
        while(p > 0) {
            if(p % 2 == 1) {
                ret *= a;
                p--;
                ret %= div;
            }
            a *= a;
            a %= div;
            p >>= 1;
        }
        return ret;
    }
}