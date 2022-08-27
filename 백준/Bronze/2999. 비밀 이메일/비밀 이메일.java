import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int r = 0;
        for(int i = 1; i <= s.length() / 2; i++) {
            if(s.length() % i == 0 && i <= s.length() / i) {
                r = i;
            }
        }
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < s.length(); j += r) {
                System.out.print(s.charAt(i + j));
            }
        }
    }
}