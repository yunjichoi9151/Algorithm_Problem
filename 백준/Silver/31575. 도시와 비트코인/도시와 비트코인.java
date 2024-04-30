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
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[M][N];
        boolean[][] visited = new boolean[M][N];
        int[] dx = {1, 0};
        int[] dy = {0, 1};
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(0, 0));
        visited[0][0] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == M - 1 && node.y == N - 1) {
                System.out.println("Yes");
                return;
            }
            for(int i = 0; i < 2; i++) {
                int nx = dx[i] + node.x;
                int ny = dy[i] + node.y;
                if(nx >= M || ny >= N || visited[nx][ny] || map[nx][ny] == 0) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
        System.out.println("No");
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}