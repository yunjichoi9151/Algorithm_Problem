import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            sum += cnt % 2 == 0 ? cnt / 2 : cnt / 2 + 1;
        }
        System.out.println(sum);
    }
}