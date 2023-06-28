import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long cnt = 1;
        for(long i = n - 2; i > 0; i--) {
            ans += i * cnt;
            cnt++;
        }
        System.out.println(ans + "\n" + 3);
        sc.close();
    }
}