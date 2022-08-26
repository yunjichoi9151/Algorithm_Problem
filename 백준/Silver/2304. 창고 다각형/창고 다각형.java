import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[][] arr1 = new int[1001][1001];
        int max = 0, max_index = 0, real_i = 0, cnt = 0;
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            if(max < arr[i][1]) {
                max = arr[i][1];
                max_index = arr[i][0];
            }
        }
        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));
        for(int i = 0; i < n; i++) {
            if(arr[i][0] == max_index) {
                real_i = i;
            }
        }
        for(int i = 0; i < real_i; i++) {
            for(int j = arr[i][0]; j < max_index; j++) {
                for(int k = 0; k < arr[i][1]; k++) {
                    arr1[k][j]++;
                }
            }
        }
        for(int i = n - 1; i > real_i; i--) {
            for(int j = arr[i][0]; j > max_index; j--) {
                for(int k = 0; k < arr[i][1]; k++) {
                    arr1[k][j]++;
                }
            }
        }
        for(int i = 0; i < 1001; i++) {
            for(int j = 0; j < 1001; j++) {
                if(arr1[i][j] >= 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt + max);
    }
}