import java.io.*;
import java.util.*;

public class Main {
    static int T, M, N, K;
    static int[][] map;
    static boolean[][] visited;
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
        StringBuilder sb = new StringBuilder();
        T =  Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new int[N][M];
            visited = new boolean[N][M];
            int cnt = 0;
            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(!visited[i][j] && map[i][j] == 1) {
                        BFS(i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static void BFS(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        que.add(new Node(x, y));
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) continue;
                if(map[nx][ny] == 1) {
                    que.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}