import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), p = sc.nextInt();
        int a = l * p;
        for(int i = 0; i < 5; i++) {
            System.out.print((sc.nextInt() - a) + " ");
        }
        sc.close();
    }
}