import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int tc = 1; tc <= n; tc++) {
            String s = sc.next();
            boolean check[] = new boolean[26];
            Boolean result = true;
            for(int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                if(check[idx]) {
                    if(s.charAt(i) != s.charAt(i - 1)) {
                        result = false;
                        break;
                    }
                }
                else {
                    check[idx] = true;
                }
            }
            if(result) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}