import java.io.*;
import java.util.*;

public class Main {
    static int K;
    static class Node {
        int x, y, cnt, k;
        public Node(int x, int y, int cnt, int k) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.k = k;
        }
    }
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[] hx = {-1, -2, -1, -2, 1, 2, 1, 2};
    static int[] hy = {-2, -1, 2, 1, 2, 1, -2, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = stoi(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = stoi(st.nextToken());
        int H = stoi(st.nextToken());
        int[][] map = new int[H][W];
        boolean[][][] visited = new boolean[H][W][K + 1];
        for(int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < W; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        int answer = -1;
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(0, 0, 0, K));
        visited[0][0][K] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == H - 1 && node.y == W - 1) {
                answer = node.cnt;
                break;
            }
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= H || ny >= W || map[nx][ny] == 1 || visited[nx][ny][node.k]) continue;
                que.add(new Node(nx, ny, node.cnt + 1, node.k));
                visited[nx][ny][node.k] = true;
            }
            if(node.k > 0) {
                for(int i = 0; i < 8; i++) {
                    int nx = node.x + hx[i];
                    int ny = node.y + hy[i];
                    if(nx < 0 || ny < 0 || nx >= H || ny >= W || map[nx][ny] == 1 || visited[nx][ny][node.k - 1]) continue;
                    que.add(new Node(nx, ny, node.cnt + 1, node.k - 1));
                    visited[nx][ny][node.k - 1] = true;
                }
            }
        }
        System.out.println(answer);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}