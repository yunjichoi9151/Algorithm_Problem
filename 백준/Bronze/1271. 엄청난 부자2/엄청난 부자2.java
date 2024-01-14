import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger n = new BigInteger(s1);
        BigInteger m = new BigInteger(s2);
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
        sc.close();
    }
}