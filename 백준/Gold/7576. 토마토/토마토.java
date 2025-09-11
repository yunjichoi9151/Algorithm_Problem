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
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int need = 0;
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 0) need++;
                else if(map[i][j] == 1) que.add(new Node(i, j, 0));
            }
        }
        if(need == 0) {
            System.out.println(0);
            return;
        }
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] != 0) continue;
                que.add(new Node(nx, ny, node.cnt + 1));
                map[nx][ny] = 1;
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
