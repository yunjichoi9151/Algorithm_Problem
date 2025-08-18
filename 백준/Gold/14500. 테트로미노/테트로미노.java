import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, cnt, sum;
        public Node(int x, int y, int cnt, int sum) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.sum = sum;
        }
    }
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static boolean[][] visited;
    static int N, M, max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        max = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                DFS(i, j, 1, map[i][j]);
                extraShape(i, j);
            }
        }
        System.out.println(max);
    }

    static void DFS(int x, int y, int depth, int sum) {
        visited[x][y] = true;
        if(depth == 4) {
            max = Math.max(max, sum);
            visited[x][y] = false;
            return;
        }
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) continue;
            DFS(nx, ny, depth + 1, sum + map[nx][ny]);
        }
        visited[x][y] = false;
    }

    static void extraShape(int x, int y) {
        int center = map[x][y];
        for(int i = 0; i < 4; i++) {
            int tmp = center;
            boolean valid = true;
            for(int j = 0; j < 4; j++) {
                if(i == j) continue;
                int nx = x + dx[j];
                int ny = y + dy[j];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    valid = false;
                    break;
                }
                tmp += map[nx][ny];
            }
            if(valid) {
                if(max < tmp) {
                    max = tmp;
                }
            }
        }
    }
}
