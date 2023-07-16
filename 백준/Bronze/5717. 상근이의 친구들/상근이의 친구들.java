import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        while(m != 0 && f != 0) {
            System.out.println(m + f);
            m = sc.nextInt();
            f = sc.nextInt();
        }
        sc.close();
    }
}