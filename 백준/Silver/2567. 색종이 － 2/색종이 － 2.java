import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[101][101];
        for(int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(arr[j][k] == 0) {
                        arr[j][k] = 1;
                    }
                }
            }
        }
        for(int i = 1; i < 100; i++) {
            for(int j = 1; j < 100; j++) {
                int cnt = arr[i - 1][j] + arr[i][j - 1] + arr[i + 1][j] + arr[i][j + 1];
                if(arr[i][j] == 1 && (cnt <= 3 && cnt >= 1)) {
                    sum++;
                    if(cnt == 2) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}