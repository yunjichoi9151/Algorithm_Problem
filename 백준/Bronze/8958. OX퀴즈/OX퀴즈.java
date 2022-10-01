import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            String s = sc.next();
            int tmp = 0;
            int sum = 0;
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == 'O') {
                    tmp++;
                } else {
                    tmp = 0;
                }
                sum += tmp;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}