import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1 == n2 && n2 == n3) {
            System.out.println(10000 + n1 * 1000);
        } else if(n1 == n2 || n2 == n3 || n3 == n1) {
            System.out.println(1000 + (n1 == n2 ? n1 : n3) * 100);
        } else {
            System.out.println(Math.max(n1, Math.max(n2, n3)) * 100);
        }
        sc.close();
    }
}