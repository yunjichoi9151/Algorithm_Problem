import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tmp = 0;
        int ans = 0;
        int[][] arr = new int[2][2];
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int y = sc.nextInt();
            if(y == 1 || y == 2) {
                tmp++;
            } else {
                if(y == 3 || y == 4) {
                    arr[0][s]++;
                } else {
                    arr[1][s]++;
                }
            }
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                if(arr[i][j] % k == 0) {
                    ans += arr[i][j] / k;
                } else {
                    ans += arr[i][j] / k + 1;
                }
            }
        }
        System.out.println(ans + (tmp % k == 0 ? tmp / k : tmp / k + 1));
        sc.close();
    }
}