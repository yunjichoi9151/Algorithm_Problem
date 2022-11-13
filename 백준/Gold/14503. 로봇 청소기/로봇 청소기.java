import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int r = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                map[i][j] = sc.nextInt();
        }
        solve(r, c, d);
        System.out.println(ans);
        sc.close();
    }

    static void solve(int r, int c, int d) {
        if(map[r][c] == 0) {
            map[r][c] = -1;
            ans++;
        } else if(map[r][c] == 1) {
            return;
        }
        int nd = d;
        for (int i = 0; i < 4; i++) {
            nd = (nd + 3) % 4;
            int nr = r + dr[nd];
            int nc = c + dc[nd];
            if (map[nr][nc] == 0) {
                solve(nr, nc, nd);
                return;
            }
        }
        solve(r - dr[d], c - dc[d], d);
        return;
    }
}