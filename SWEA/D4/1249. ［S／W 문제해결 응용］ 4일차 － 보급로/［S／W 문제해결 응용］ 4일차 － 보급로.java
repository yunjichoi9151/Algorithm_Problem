import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    static int[][] map, tmp;
    static boolean[][] visit;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };
    static int n, ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            map = new int[n][n];
            tmp = new int[n][n];
            visit = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = s.charAt(j) - '0';
                }
            }
            ans = Integer.MAX_VALUE;
            bfs();

            sb.append("#").append(tc).append(" ").append(ans).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }

    public static void bfs() {
        Queue<Node> q = new LinkedList<Node>();
        q.offer(new Node(0, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();

            if (node.x == n - 1 && node.y == n - 1) {
                ans = (ans > tmp[node.y][node.x]) ? tmp[node.y][node.x] : ans;
                continue;
            }

            if (ans <= tmp[node.y][node.x]) {
                continue;
            }

            for (int i = 0; i < 4; ++i) {
                int ny = node.y + dy[i];
                int nx = node.x + dx[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }

                if (!visit[ny][nx] || tmp[node.y][node.x] + map[ny][nx] < tmp[ny][nx]) {
                    visit[ny][nx] = true;
                    tmp[ny][nx] = tmp[node.y][node.x] + map[ny][nx];
                    q.offer(new Node(ny, nx));
                }
            }
        }
    }

    public static class Node {
        int x;
        int y;

        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}