import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = n / 5; i >= 0; i--) {
            if((n - i * 5) % 3 == 0) {
                System.out.println(i + ((n - i * 5) / 3));
                break;
            }
            else {
                cnt++;
            }
        }
        if(cnt == n / 5 + 1) {
            System.out.println(-1);
        }
    }
}