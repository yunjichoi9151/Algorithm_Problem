import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        int time = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while(true) {
            visited = new boolean[N][M];
            int cnt = 0;
            int zero_cnt = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(!visited[i][j] && map[i][j] != 0) {
                        BFS(i, j);
                        cnt++;
                    }
                }
            }
            if(cnt > 1) break;
            visited = new boolean[N][M];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(map[i][j] != 0) {
                        int tmp = 0;
                        for(int k = 0; k < 4; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];
                            if(nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] != 0 || visited[nx][ny]) continue;
                            tmp++;
                        }
                        map[i][j] = Math.max(map[i][j] - tmp, 0);
                        visited[i][j] = true;
                    }
                    if(map[i][j] == 0) zero_cnt++;
                }
            }
            if(zero_cnt == N * M) {
                time = 0;
                break;
            }
            time++;
        }
        System.out.println(time);
    }

    static void BFS(int x, int y) {
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(x, y));
        visited[x][y] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 0) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }
}