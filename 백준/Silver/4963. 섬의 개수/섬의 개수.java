import java.io.*;
import java.util.*;

public class Main {
    static int W, H;
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
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            if(W == 0 && H == 0) break;
            map = new int[H][W];
            visited = new boolean[H][W];
            int cnt = 0;
            for(int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i = 0; i < H; i++) {
                for(int j = 0; j < W; j++) {
                    if(map[i][j] == 1 && !visited[i][j]) {
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
        int[] dx = {-1, 1, 0, 0, 1, 1, -1, -1};
        int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(x, y));
        visited[x][y] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 8; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= H || ny >= W || visited[nx][ny] || map[nx][ny] == 0) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }
}