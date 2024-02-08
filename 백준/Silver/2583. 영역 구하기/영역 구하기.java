import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        ans = new ArrayList<Integer>();
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        visited = new boolean[M][N];
        int cnt = 0;
        for(int t = 0; t < K; t++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int i = y1; i < y2; i++) {
                for(int j = x1; j < x2; j++) {
                    map[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 0 && !visited[i][j]) {
                    ans.add(BFS(i, j));
                    cnt++;
                }
            }
        }
        Collections.sort(ans);
        System.out.println(cnt);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + (i == ans.size() - 1 ? "" : " "));
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
                if(nx < 0 || ny < 0 || nx >= M || ny >= N || visited[nx][ny] || map[nx][ny] == 1) continue;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
                num++;
            }
        }
        return num;
    }
}