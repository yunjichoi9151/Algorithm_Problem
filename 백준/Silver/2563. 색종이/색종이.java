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
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}