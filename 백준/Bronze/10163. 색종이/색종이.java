import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[1001][1001];
        int[][] arr1 = new int[n + 1][4];
        int[] sum = new int[n + 1];
        for(int tc = 1; tc <= n; tc++) {
            for(int i = 0; i < 4; i++) {
                arr1[tc][i] = sc.nextInt();
            }
            for(int i = arr1[tc][0]; i <= arr1[tc][0] + arr1[tc][2] - 1; i++) {
                for(int j = arr1[tc][1]; j <= arr1[tc][1] + arr1[tc][3] - 1; j++) {
                    if(arr[i][j] != 0) {
                        sum[arr[i][j]]--;
                    }
                    arr[i][j] = tc;
                    sum[tc]++;
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            System.out.println(sum[i]);
        }
        sc.close();
    }    
}