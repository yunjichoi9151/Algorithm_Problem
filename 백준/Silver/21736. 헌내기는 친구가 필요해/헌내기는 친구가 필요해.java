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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][M];
        boolean[][] visited = new boolean[N][M];
        Node now = new Node(0, 0);
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = S.charAt(j);
                if(map[i][j] == 'I') {
                    now.x = i;
                    now.y = j;
                }
            }
        }
        Queue<Node> que = new LinkedList<>();
        que.add(now);
        visited[now.x][now.y] = true;
        int cnt = 0;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 'X') continue;
                if(map[nx][ny] == 'P') cnt++;
                visited[nx][ny] = true;
                que.add(new Node(nx, ny));
            }
        }
        System.out.println(cnt == 0 ? "TT" : cnt);
    }
}
