import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, cnt;
        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(S.charAt(j) + "");
            }
        }
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(0, 0, 1));
        visited[0][0] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == N - 1 && node.y == M - 1) {
                System.out.println(node.cnt);
                return;
            }
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 0) continue;
                que.add(new Node(nx, ny, node.cnt + 1));
                visited[nx][ny] = true;
            }
        }
    }
}
