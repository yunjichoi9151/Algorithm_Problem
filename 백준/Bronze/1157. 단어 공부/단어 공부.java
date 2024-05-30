import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        char[] arr = s.toCharArray();
        int[] cnt = new int[26];
        int max = 0;
        char answer = '?';
        boolean already = false;
        for(char c : arr) {
            cnt[c - 'A']++;
            if(max < cnt[c - 'A']) max = cnt[c - 'A'];
        }
        for(int i = 0; i < 26; i++) {
            if(max == cnt[i]) {
                if(already) {
                    answer = '?';
                    break;
                } else {
                    answer = (char)(i + 'A');
                    already = true;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}