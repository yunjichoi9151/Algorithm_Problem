import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    static int n, w, h, res;
    static int[][] map;
    static int[] s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            w = sc.nextInt();
            h = sc.nextInt();
            map = new int[h][w];
            s = new int[n];
            res = Integer.MAX_VALUE;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            put_ball(0);
            System.out.println("#" + tc + " " + res);
        }
        sc.close();
    }

    public static void put_ball(int cnt) {
        if (cnt == n) {
            game_start();
            return;
        }
        for (int i = 0; i < w; i++) {
            s[cnt] = i;
            put_ball(cnt + 1);
        }
    }

    public static void game_start() {
        int[][] tmp = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                tmp[i][j] = map[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            int x = -1;
            int y = s[i];
            for (int j = 0; j < h; j++) {
                if (tmp[j][y] != 0) {
                    x = j;
                    break;
                }
            }
            if (x == -1)
                continue;

            breaking(x, y, tmp);
            down_bricks(tmp);
        }

        int cnt = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (tmp[i][j] != 0)
                    cnt++;
            }
        }
        res = Math.min(cnt, res);
    }

    public static void breaking(int x, int y, int[][] tmp) {
        int n = tmp[x][y];
        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { -1, 1, 0, 0 };

        tmp[x][y] = 0;
        if (n == 1)
            return;

        for (int i = 0; i < 4; i++) {
            int nowx = x, nowy = y;
            for (int nn = 0; nn < n - 1; nn++) {
                nowx += dx[i];
                nowy += dy[i];
                if (0 > nowx || 0 > nowy || h <= nowx || w <= nowy)
                    break;
                if (tmp[nowx][nowy] == 0)
                    continue;
                if (tmp[nowx][nowy] == 1) {
                    tmp[nowx][nowy] = 0;
                } else {
                    breaking(nowx, nowy, tmp);
                }
            }
        }
    }

    public static void down_bricks(int[][] tmp) {
        Queue<Integer> q;

        for (int i = 0; i < w; i++) {
            q = new LinkedList<>();
            for (int j = h - 1; j >= 0; j--) {
                if (tmp[j][i] != 0) {
                    q.add(tmp[j][i]);
                    tmp[j][i] = 0;
                }
            }
            int x = h - 1;
            while (!q.isEmpty()) {
                tmp[x--][i] = q.poll();
            }
        }

    }
}