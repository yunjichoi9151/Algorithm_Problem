import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
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
        HashSet<Integer> set = new HashSet<Integer>();
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                set.add(map[i][j]);
            }
        }
        int max = 1;
        for(int num : set) {
            visited = new boolean[N][N];
            int cnt = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j] > num && !visited[i][j]) {
                        BFS(i, j, num);
                        cnt++;
                    }
                }
            }
            if(max < cnt) max = cnt;
        }
        System.out.println(max);
    }

    static void BFS(int x, int y, int num) {
        Queue<Node> que = new LinkedList<Node>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        que.add(new Node(x, y));
        visited[x][y] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny] || map[nx][ny] <= num) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
            }
        }
    }
}