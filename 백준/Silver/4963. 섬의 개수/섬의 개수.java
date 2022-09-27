import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int w, h, cnt;
    static int[][] map;
    static boolean[][] visit;
    static Queue<Node> queue;
    static int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };
    static int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            map = new int[h][w];
            visit = new boolean[h][w];
            if (w == 0 && h == 0) {
                break;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            bfs();
            System.out.println(cnt);
            cnt = 0;
        }
        sc.close();
    }

    public static void bfs() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] != 1 || visit[i][j]) {
                    continue;
                }
                queue = new LinkedList<Node>();
                visit[i][j] = true;
                queue.add(new Node(i, j));
                while (!queue.isEmpty()) {
                    Node tmp = queue.poll();
                    for (int k = 0; k < 8; k++) {
                        int ty = tmp.y + dy[k];
                        int tx = tmp.x + dx[k];
                        if (ty < 0 || ty >= h || tx < 0 || tx >= w) {
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

    public static class Node {
        int y;
        int x;

        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}