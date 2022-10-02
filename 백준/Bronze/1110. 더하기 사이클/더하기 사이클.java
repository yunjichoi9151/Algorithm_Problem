import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int num = n;
        while(true) {
            if(cnt != 0 && num == n) {
                break;
            } else {
                num = ((num % 10) * 10) + ((num / 10 + num % 10) % 10);
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}