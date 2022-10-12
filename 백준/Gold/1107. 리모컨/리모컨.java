import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = Math.abs(100 - n);
        boolean[] isBroken = new boolean[10];
        for(int i = 0; i < m; i++) {
            isBroken[sc.nextInt()] = true;
        }
        for(int i = 0; i <= 999999; i++) {
            String tmp = Integer.toString(i);
            boolean check = false;
            for(int j = 0; j < tmp.length(); j++) {
                if(isBroken[tmp.charAt(j) - '0']) {
                    check = true;
                    break;
                }
            }
            if(!check) {
                ans = Math.min(ans, tmp.length() + Math.abs(i - n));
            }
        }
        System.out.println(ans);
        sc.close();
    }
}