import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((long)Math.pow(n, 2) + "\n" + 2);
        sc.close();
    }
}