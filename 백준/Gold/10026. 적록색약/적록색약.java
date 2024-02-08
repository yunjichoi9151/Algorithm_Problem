import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        visited = new boolean[N][N];
        sb.append(cal(false) + " ");
        visited = new boolean[N][N];
        sb.append(cal(true));
        System.out.println(sb.toString());
    }

    static void BFS(int x, int y, boolean isTrue) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(x, y));
        visited[x][y] = true;
        char c = map[x][y];
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny]) continue;
                if((isTrue && (c == 'B' && map[nx][ny] == 'B' || c != 'B' && map[nx][ny] != 'B'))
                    || (!isTrue && map[nx][ny] == c)) {
                        que.add(new Node(nx, ny));
                        visited[nx][ny] = true;
                    }
            }
        }
    }

    static int cal(boolean isTrue) {
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    BFS(i, j, isTrue);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}