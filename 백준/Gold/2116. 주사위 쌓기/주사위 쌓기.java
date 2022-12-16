import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, tmp = 0;
        int n = sc.nextInt();
        int[][] arr = new int[n][6];
        for(int tc = 0; tc < n; tc++) {
            for(int i = 0; i < 6; i++) {
                arr[tc][i] = sc.nextInt();
            }
        }
        for(int i = 0; i < 6; i++) {
            int sum = 0, start = 0, end = 0;
            for(int j = 0; j < n; j++) {
                if(j == 0) {
                    start = arr[j][i];
                    end = dice(arr, j, i);
                    sum += plus(arr, n, j, start, end);
                }
                else {
                    for(int k = 0; k < 6; k++) {
                        if(arr[j][k] == end) {
                            start = arr[j][k];
                            end = dice(arr, j, k);
                            sum += plus(arr, n, j, start, end);
                            break;
                        }
                    }
                }
            }
            if(max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
    public static int dice(int arr[][], int tmp, int i) {
        int end = 0;
        if(i == 0) {
            end = arr[tmp][5];
        }
        else if(i == 1) {
            end = arr[tmp][3];
        }
        else if(i == 2) {
            end = arr[tmp][4];
        }
        else if(i == 3) {
            end = arr[tmp][1];
        }
        else if(i == 4) {
            end = arr[tmp][2];
        }
        else if(i == 5) {
            end = arr[tmp][0];
        }
        return end;
    }
    public static int plus(int[][] arr, int n, int tmp, int start, int end) {
        int max = 0;
        for(int i = 0; i < 6; i++) {
            if(arr[tmp][i] != start && arr[tmp][i] != end) {
                if(max < arr[tmp][i]) {
                    max = arr[tmp][i];
                }
            }
        }
        return max;
    }
}