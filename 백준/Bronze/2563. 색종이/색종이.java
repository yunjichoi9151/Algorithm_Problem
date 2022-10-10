import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[100][100];
        int cnt = 0;
        int n = sc.nextInt();
        for(int tc = 0; tc < n; tc++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i = y; i < y + 10; i++) {
                for(int j = x; j < x + 10; j++) {
                    map[i][j]++;
                }
            }
        }
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(map[i][j] > 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}