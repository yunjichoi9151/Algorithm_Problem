import java.io.*;
import java.util.*;

public class Main {
static class Node {
    int y, x, cnt;
    public Node(int y, int x, int cnt) {
        this.y = y;
        this.x = x;
        this.cnt = cnt;
    }
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int sum = N * M;
        int tomato = 0;
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) {
                    que.add(new Node(i, j, 0));
                    tomato++;
                } else if(map[i][j] == -1) {
                    sum--;
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
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || ny >= N || nx >= M || map[ny][nx] != 0) continue;
                que.add(new Node(ny, nx, node.cnt + 1));
                map[ny][nx] = 1;
                tomato++;
            }
        }
        System.out.println(sum == tomato ? day : -1);
    }
}
