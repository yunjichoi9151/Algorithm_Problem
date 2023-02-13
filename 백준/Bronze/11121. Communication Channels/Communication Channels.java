import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next(), b =sc.next();
            System.out.println(a.equals(b) ? "OK" : "ERROR");
        }
    }
}
