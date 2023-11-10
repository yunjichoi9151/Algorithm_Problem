import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 1;
        for(int i = 0; i < k; i++) {
            ans = ans * (n - i) / (i + 1);
        }
        System.out.println(ans);
        sc.close();
    }
}