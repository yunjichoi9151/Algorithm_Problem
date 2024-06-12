import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, z, day;
        public Node(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = stoi(st.nextToken());
        int N = stoi(st.nextToken());
        int H = stoi(st.nextToken());
        int[][][] map = new int[H][N][M];
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0, 0, 0};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dz = {0, 0, 0, 0, -1, 1};
        int zero_cnt = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++) {
                    map[i][j][k] = stoi(st.nextToken());
                    if (map[i][j][k] == 0) zero_cnt++;
                    else if(map[i][j][k] == 1) que.add(new Node(i, j, k, 0));
                }
            }
        }
        if(zero_cnt == 0) {
            System.out.println(0);
            return;
        }
        int answer = -1;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 6; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                int nz = node.z + dz[i];
                if(nx < 0 || ny < 0 || nz < 0 || nx >= H || ny >= N || nz >= M || map[nx][ny][nz] != 0) continue;
                que.add(new Node(nx, ny, nz, node.day + 1));
                map[nx][ny][nz] = 1;
                zero_cnt--;
            }
            if(zero_cnt == 0) {
                answer = node.day + 1;
                break;
            }
        }
        System.out.println(answer);
    }
    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}