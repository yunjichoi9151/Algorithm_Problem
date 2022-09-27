import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    static int n, cnt, res;
    static int[][] map;
    static boolean[][] visit;
    static Queue<Node> queue;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < 101; i++) {
                check(i);
                bfs();
            }
            System.out.println("#" + tc + " " + res);
            res = 0;
        }
        sc.close();
    }

    public static void bfs() {
        cnt = 0;
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0 && !visit[i][j]) {
                    queue = new LinkedList<Node>();
                    visit[i][j] = true;
                    queue.add(new Node(i, j));
                    while (!queue.isEmpty()) {
                        Node tmp = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int ty = tmp.y + dy[k];
                            int tx = tmp.x + dx[k];
                            if (ty < 0 || ty >= n || tx < 0 || tx >= n) {
                                continue;
                            }
                            if (map[ty][tx] == 0 || visit[ty][tx]) {
                                continue;
                            }
                            visit[ty][tx] = true;
                            queue.add(new Node(ty, tx));
                        }
                    }
                    cnt++;
                }
            }
        }
        if (res < cnt) {
            res = cnt;
        }
    }

    public static void check(int num) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == num) {
                    map[i][j] = 0;
                }
            }
        }
    }

    public static class Node {
        int y;
        int x;

        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}