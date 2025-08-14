import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, z, cnt;
        public Node(int x, int y, int z, int cnt) {
            this.x = x;
            this.y = y;
            this.z = z;
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
        int[] dx = {0, 0, 0, 0, -1, 1};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dz = {-1, 1, 0, 0, 0, 0};
        Queue<Node> que = new LinkedList<>();
        int sum = M * N * H;
        int tomato = 0;
        for(int z = 0; z < H; z++) {
            for(int y = 0; y < N; y++) {
                st = new StringTokenizer(br.readLine());
                for(int x = 0; x < M; x++) {
                    map[z][y][x] = Integer.parseInt(st.nextToken());
                    if(map[z][y][x] == 1) {
                        que.add(new Node(x, y, z, 0));
                        tomato++;
                    } else if(map[z][y][x] == -1) {
                        sum--;
                    }
                }
            }
        }
        if(sum == tomato) {
            System.out.println(0);
            return;
        }
        int day = 0;
        while(!que.isEmpty()) {
            Node node = que.poll();
            day = node.cnt;
            for(int i = 0; i < 6; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                int nz = node.z + dz[i];
                if(nx < 0 || ny < 0 || nz < 0 || nx >= M || ny >= N || nz >= H || map[nz][ny][nx] == -1 || map[nz][ny][nx] == 1) continue;
                que.add(new Node(nx, ny, nz, node.cnt + 1));
                map[nz][ny][nx] = 1;
                tomato++;
            }
        }
        System.out.println(sum == tomato ? day : -1);
    }
}
