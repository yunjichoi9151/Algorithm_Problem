import java.util.Scanner;

public class Solution {
    static int n, res;
    static int[][] map;
    static int[] dr = { 1, 1, -1, -1 };
    static int[] dc = { 1, -1, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            map = new int[n][n];
            res = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n - 2; i++) {
                for (int j = 1; j < n - 1; j++) {
                    find(i, j, i, j, new boolean[101], 0, 1);
                }
            }
            System.out.println("#" + tc + " " + res);
        }
        sc.close();
    }

    public static void find(int tr, int tc, int nr, int nc, boolean[] visit, int dir, int sum) {
        visit[map[nr][nc]] = true;
        if (dir > 3) {
            return;
        }
        nr += dr[dir];
        nc += dc[dir];
        if (nr == tr && nc == tc) {
            res = Math.max(sum, res);
            return;
        }
        if (nr < tr) {
            return;
        }
        if (nr < 0 || nr > n - 1 || nc < 0 || nc > n - 1) {
            return;
        }
        if (visit[map[nr][nc]]) {
            return;
        }
        visit[map[nr][nc]] = true;
        find(tr, tc, nr, nc, visit, dir, sum + 1);
        find(tr, tc, nr, nc, visit, dir + 1, sum + 1);
        visit[map[nr][nc]] = false;
    }
}