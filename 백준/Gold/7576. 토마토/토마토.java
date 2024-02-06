import java.io.*;
import java.util.*;

public class Main {
    static int N, M, cnt, ans;
    static int[][] map;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        Queue<Node> que = new LinkedList<Node>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) {
                    visited[i][j] = true;
                    que.add(new Node(i, j));
                } else if(map[i][j] == 0) cnt++;
            }
        }
        if(cnt == 0) {
            System.out.println(0);
            return;
        }
        BFS(que);
        System.out.println(cnt == 0 ? ans - 1 : -1);
    }

    public static void BFS(Queue<Node> que) {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(!visited[nx][ny] && map[nx][ny] == 0) {
                    visited[nx][ny] = true;
                    ans = map[nx][ny] = map[node.x][node.y] + 1;
                    que.add(new Node(nx, ny));
                    cnt--;
                }
            }
        }
    }
}

class Node {
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}