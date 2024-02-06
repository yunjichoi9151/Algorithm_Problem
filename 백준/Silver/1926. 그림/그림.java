import java.io.*;
import java.util.*;

public class Main {
    static int n, m, cnt, ans;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    BFS(i, j);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(ans);
    }

    public static void BFS(int x, int y) {
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(x, y));
        visited[x][y] = true;
        int size = 1;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= n || ny >= m
                        || visited[nx][ny] || map[nx][ny] == 0) {
                        continue;
                    }
                    que.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                    size++;
                }
            }
        }
        cnt++;
        if(ans < size) ans = size;
    }
}

class Node {
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

}