import java.io.*;
import java.util.*;

public class Main {
    static int R, C;
    static char[][] map;
    static boolean[][] visited;
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
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int answer = 0;
        map = new char[R][C];
        visited = new boolean[R][C];
        for(int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(map[i][j] == '#' && !visited[i][j]) {
                    BFS(i, j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    static void BFS(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        que.add(new Node(x, y));
        visited[x][y] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] != '#' || visited[nx][ny]) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }
}