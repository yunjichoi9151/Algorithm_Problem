import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String S = sc.next();
        int cnt = 1;
        int len = S.length();
        while(cnt <= len) {
            for(int i = 0; i < len - cnt + 1; i++) {
                StringBuilder sb = new StringBuilder();
                for(int j = i; j < i + cnt; j++) {
                    sb.append(S.charAt(j));
                }
                set.add(sb.toString());
            }
            cnt++;
        }
        System.out.println(set.size());
        sc.close();
    }
}