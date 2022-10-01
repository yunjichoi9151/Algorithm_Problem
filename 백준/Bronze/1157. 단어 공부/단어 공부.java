import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int[] arr = new int[26];
        int max = 0;
        char ans = '?';
        for(int i = 0; i < s.length(); i++) {
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++) {
            if(max < arr[i]) {
                max = arr[i];
                ans = (char)(i + 65);
            }
            else if(arr[i] == max) {
                ans = '?';
            }
        }
        System.out.println(ans);
        sc.close();
    }
}