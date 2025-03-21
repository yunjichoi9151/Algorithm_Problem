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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int cnt = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    int tmp = 0;
                    Queue<Node> que = new LinkedList<>();
                    que.add(new Node(i, j));
                    visited[i][j] = true;
                    while(!que.isEmpty()) {
                        Node node = que.poll();
                        tmp++;
                        for(int k = 0; k < 4; k++) {
                            int nx = node.x + dx[k];
                            int ny = node.y + dy[k];
                            if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 0) continue;
                            que.add(new Node(nx, ny));
                            visited[nx][ny] = true;
                        }
                    }
                    if(tmp > max) max = tmp;
                    cnt++;
                }
            }
        }
        System.out.println(cnt + "\n" + max);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}
