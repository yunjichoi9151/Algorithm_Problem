import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int res = 0;
        for(int i = 0; i <= 50; i++) {
            for(int j = 0; j <= 50; j++) {
                for(int k = 0; k <= 50; k++) {
                    if((a * i) + (b * j) + (c * k) == n) {
                        res = 1;
                    }
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}