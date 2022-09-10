import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        int n1 = (Math.abs(w - x) < Math.abs(h - y)) ? Math.abs(w - x) : Math.abs(h - y);
        int n2 = x < y ? x : y;
        System.out.println(n1 < n2 ? n1 : n2);
    }
}