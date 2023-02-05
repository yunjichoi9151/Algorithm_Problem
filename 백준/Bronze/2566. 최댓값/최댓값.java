import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int max = 0;
        int ans_i = 0;
        int ans_j = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9 ; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    ans_i = i;
                    ans_j = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(ans_i + " " + ans_j);
    }
}