import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[2][7];
        for(int tc = 1; tc <= n; tc++) {
            int s = sc.nextInt(), y = sc.nextInt();
            arr[s][y]++;
        }
        for(int i = 0; i <= 1; i++) {
            for(int j = 1; j <= 6; j++) {
                if(arr[i][j] % k == 0) {
                    sum += arr[i][j] / k;
                }
                else {
                    sum += arr[i][j] / k + 1;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}