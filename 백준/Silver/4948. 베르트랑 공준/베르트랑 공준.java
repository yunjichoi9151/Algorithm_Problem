import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0) {
            if(n > 0) {
                int cnt = 0;
                for(int i = n + 1; i <= 2 * n; i++) {
                    if(find(i)) {
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
            n = sc.nextInt();
        }
    }

    public static boolean find(int n) {
        if(n == 1) {
            return false;
        } else if(n == 2 || n == 3) {
            return true;
        }
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}