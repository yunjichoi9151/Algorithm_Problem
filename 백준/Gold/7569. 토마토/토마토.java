import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int h, x, y, cnt;
        public Node(int h, int x, int y, int cnt) {
            this.h = h;
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[][][] map = new int[H][N][M];
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0, 0, 0};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dh = {0, 0, 0, 0, -1, 1};
        int need = 0;
        for(int h = 0; h < H; h++) {
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < M; j++) {
                    map[h][i][j] = Integer.parseInt(st.nextToken());
                    if(map[h][i][j] == 0) need++;
                    else if(map[h][i][j] == 1) que.add(new Node(h, i, j, 0));
                }
            }
        }
        if(need == 0) {
            System.out.println(0);
            return;
        }
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 6; i++) {
                int nh = node.h + dh[i];
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nh < 0 || nx < 0 || ny < 0 || nh >= H || nx >= N || ny >= M || map[nh][nx][ny] != 0) continue;
                que.add(new Node(nh, nx, ny, node.cnt + 1));
                map[nh][nx][ny] = 1;
                need--;
                if(need == 0) {
                    System.out.println(node.cnt + 1);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
