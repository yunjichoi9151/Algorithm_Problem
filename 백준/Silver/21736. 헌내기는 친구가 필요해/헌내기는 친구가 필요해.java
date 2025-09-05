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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][M];
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, 1, -1, 0};
        Queue<Node> que = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int ans = 0;
        for(int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 'I') {
                    que.add(new Node(i, j));
                    visited[i][j] = true;
                }
            }
        }
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 'X') continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
                if(map[nx][ny] == 'P') ans++;
            }
        }
        System.out.println(ans == 0 ? "TT" : ans);
    }
}
