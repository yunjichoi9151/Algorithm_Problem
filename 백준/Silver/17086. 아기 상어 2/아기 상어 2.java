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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int[][] dis = new int[N][M];
        Queue<Node> que = new LinkedList<Node>();
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        int ans = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) que.add(new Node(i, j));
            }
        }
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 8; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || dis[nx][ny] != 0 || map[nx][ny] == 1) continue;
                dis[nx][ny] = dis[node.x][node.y] + 1;
                ans = Math.max(ans, dis[nx][ny]);
                que.add(new Node(nx, ny));
            }
        }
        System.out.println(ans);
    }
}