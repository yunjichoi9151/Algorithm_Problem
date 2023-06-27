import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i);
                ans += (tmp - (tmp <= 57 ? 48 : 55)) * Math.pow(n, (s.length() - i - 1));
        }
        System.out.println(ans);
        sc.close();
    }
}