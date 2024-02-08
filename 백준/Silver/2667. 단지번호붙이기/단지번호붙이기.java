import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> ans;
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
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        ans = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    ans.add(BFS(i, j));
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans.size());
        for(int n : ans) {
            System.out.println(n);
        }
    }

    static int BFS(int x, int y) {
        Queue<Node> que = new LinkedList<Node>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        que.add(new Node(x, y));
        visited[x][y] = true;
        int num = 1;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny] || map[nx][ny] == 0) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
                num++;
            }
        }
        return num;
    }
}