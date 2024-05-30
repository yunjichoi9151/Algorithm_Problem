import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if(N == 1) {
            System.out.println(1);
        } else {
            int x = 1;
            while(true) {
                int s = 1 + 3 * (x - 1) * x;
                if(N <= s) {
                    System.out.println(x);
                    break;
                }
                x++;
            }
        }
        sc.close();
    }
}