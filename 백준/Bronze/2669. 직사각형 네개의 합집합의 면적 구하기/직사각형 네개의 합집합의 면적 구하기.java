import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int sum = 0;
        for(int t = 1; t <= 4; t++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            for(int i = y1; i < y2; i++) {
                for(int j = x1; j < x2; j++) {
                    arr[i][j]++;
                }
            }
        }
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(arr[i][j] >= 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}