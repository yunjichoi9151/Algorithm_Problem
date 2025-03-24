import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x;
        int y;
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
        StringTokenizer st = null;
        int T = stoi(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int M = stoi(st.nextToken());
            int N = stoi(st.nextToken());
            int K = stoi(st.nextToken());
            int[][] map = new int[M][N];
            boolean[][] visited = new boolean[M][N];
            int cnt = 0;
            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                map[stoi(st.nextToken())][stoi(st.nextToken())] = 1;
            }
            for(int i = 0; i < M; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j] == 1 && !visited[i][j]) {
                        visited[i][j] = true;
                        Queue<Node> que = new LinkedList<>();
                        que.add(new Node(i, j));
                        while(!que.isEmpty()) {
                            Node node = que.poll();
                            for(int k = 0; k < 4; k++) {
                                int nx = node.x + dx[k];
                                int ny = node.y + dy[k];
                                if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
                                if(map[nx][ny] == 1 && !visited[nx][ny]) {
                                    que.add(new Node(nx, ny));
                                    visited[nx][ny] = true;
                                }
                            }
                        }
                        cnt++;
                    }
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}
