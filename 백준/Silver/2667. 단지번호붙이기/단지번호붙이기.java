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
    static int N;
    static char[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == '1' && !visited[i][j]) {
                    list.add(BFS(i, j));
                }
            }
        }
        sb.append(list.size()).append("\n");
        Collections.sort(list);
        for(int num : list) {
            sb.append(num).append("\n");
        }
        System.out.print(sb);
    }

    static int BFS(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int cnt = 0;
        que.add(new Node(x, y));
        visited[x][y] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            cnt++;
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny] || map[nx][ny] == '0') continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
        return cnt;
    }
}
