import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            boolean[][] map = new boolean[N][M];
            boolean[][] visited = new boolean[N][M];
            Queue<Node> que = new LinkedList<>();
            int cnt = 0;
            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = true;
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(map[i][j] && !visited[i][j]) {
                        que.add(new Node(i, j));
                        visited[i][j] = true;
                        cnt++;
                        while(!que.isEmpty()) {
                            Node node = que.poll();
                            for(int k = 0; k < 4; k++) {
                                int nx = node.x + dx[k];
                                int ny = node.y + dy[k];
                                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) continue;
                                if(map[nx][ny]) {
                                    que.add(new Node(nx, ny));
                                    visited[nx][ny] = true;
                                }
                            }
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
