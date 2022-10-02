import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int[] check = new int[26];
            String s = sc.next();
            char[] arr = s.toCharArray();
            boolean res = true;
            for(int j = 0; j < arr.length; j++) {
                int tmp = (int)arr[j] - 97;
                if(check[tmp] == 0) {
                    check[tmp]++;
                } else {
                    if(arr[j - 1] == arr[j]) {
                        continue;
                    } else {
                        res = false;
                        break;
                    }
                }
            }
            if(res == true) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}