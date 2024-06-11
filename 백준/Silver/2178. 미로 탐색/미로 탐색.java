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
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        char[][] map = new char[N][M];
        boolean[][] visited = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int answer = Integer.MAX_VALUE;
        que.add(new Node(0, 0, 1));
        visited[0][0] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == N - 1 && node.y == M - 1) {
                System.out.println(node.cnt);
                break;
            }
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] != '1' || visited[nx][ny]) continue;
                que.add(new Node(nx, ny, node.cnt + 1));
                visited[nx][ny] = true;
            }
        }
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}