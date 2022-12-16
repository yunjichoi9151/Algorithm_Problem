import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int n1 = i;
            while(n1 != 0) {
                sum += n1 % 10;
                n1 /= 10;
            }
            if(sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}