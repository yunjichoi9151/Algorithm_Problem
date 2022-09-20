import java.util.Scanner;

public class Main {
    static int[][] map;
    static int cnt, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        DFS(0, 1, 0);
        System.out.println(cnt);
    }

    public static void DFS(int y, int x, int dir) {
        if (y == n - 1 && x == n - 1) {
            cnt++;
            return;
        }
        if (dir == 0) {
            if (x + 1 < n && map[y][x + 1] == 0) {
                DFS(y, x + 1, 0);
            }
        }

        else if (dir == 1) {
            if (y + 1 < n && map[y + 1][x] == 0) {
                DFS(y + 1, x, 1);
            }
        }

        else if (dir == 2) {
            if (x + 1 < n && map[y][x + 1] == 0) {
                DFS(y, x + 1, 0);
            }
            if (y + 1 < n && map[y + 1][x] == 0) {
                DFS(y + 1, x, 1);
            }
        }
        if (y + 1 < n && x + 1 < n && map[y][x + 1] == 0 && map[y + 1][x] == 0 && map[y + 1][x + 1] == 0) {
            DFS(y + 1, x + 1, 2);
        }
    }
}