import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int a = n;
            int[] num_arr = new int[10];
            int sum = 0;
            int ans = 0;
            while(sum != 10) {
                a = n * (ans + 1);
                int tmp = a;
                while(tmp > 0) {
                    if(num_arr[tmp % 10] == 0) {
                        num_arr[tmp % 10]++;
                        sum++;
                    }
                    tmp /= 10;
                }
                ans++;
            }
            System.out.printf("#%d %d\n", tc, a);
        }
        sc.close();
    }
}