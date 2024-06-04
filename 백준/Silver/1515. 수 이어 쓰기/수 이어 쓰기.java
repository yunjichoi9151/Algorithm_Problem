import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int idx = 0;
        int num = 1;
        while(idx < s.length()) {
            String tmp = String.valueOf(num);
            for(int i = 0; i < tmp.length(); i++) {
                if(s.charAt(idx) == tmp.charAt(i)) idx++;
                if(idx >= s.length()) break;
            }
            num++;
        }
        System.out.println(num - 1);
        sc.close();
    }
}