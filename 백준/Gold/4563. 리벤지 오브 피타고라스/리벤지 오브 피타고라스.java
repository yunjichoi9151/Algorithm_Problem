import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            long a = sc.nextLong();
            if(a != 0) {
                int res = 0;
                for(int i = 1; i <= a; i++) {
                    if((a * a) % i == 0 && ((a * a) / i - i) % 2 == 0 && ((a * a) / i - i) / 2 > a) {
                        res++;
                    }
                }
                System.out.println(res);
            }
            else {
                break;
            }
        }
    }
}