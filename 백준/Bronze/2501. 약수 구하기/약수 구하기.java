import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
            if(cnt == k) {
                System.out.println(i);
                break;
            }
        }
        if(cnt < k) {
            System.out.println(0);
        }
        sc.close();
    }
}