import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        String s = sc.next();
        String[] arr = new String[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) + "";
        }
        int k = 0;
        while(k <= n - 1) {
            if(k > 0 && arr[k - 1].equals("L") && arr[k].equals("L")) {
                cnt++;
                k++;
            }
            k++;
        }
        System.out.println((n + 1 - cnt) > n ? n : (n + 1 - cnt));
    }
}