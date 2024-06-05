import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String S = sc.next();
        int[] cnt = new int[2];
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '0') cnt[0]++;
            else cnt[1]++;
        }
        cnt[0] /= 2;
        cnt[1] /= 2;
        boolean[] check = new boolean[S.length()];
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '1' && cnt[1] > 0) {
                check[i] = true;
                cnt[1]--;
            }
            if(S.charAt(S.length() - 1 - i) == '0' && cnt[0] > 0) {
                check[S.length() - 1 - i] = true;
                cnt[0]--;
            }
        }
        for(int i = 0; i < S.length(); i++) {
            if(!check[i]) sb.append(S.charAt(i));
        }
        System.out.println(sb.toString());
        sc.close();
    }
}