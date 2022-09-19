import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt();
        int p = sc.nextInt(), q = sc.nextInt();
        int t = sc.nextInt();
        p = (p + t) % (2 * w);
        q = (q + t) % (2 * h);
        if (p > w) p = 2 * w - p;
        if (q > h) q = 2 * h - q;
        System.out.println(p + " " + q);
        sc.close();
    }    
}