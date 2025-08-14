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
    static char[][] arr;
    static boolean[][][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            for(int j = 0; j < N; j++) {
                arr[i][j] = S.charAt(j);
            }
        }
        int[] cnt = new int[2];
        visited = new boolean[N][N][2];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j][0]) {
                    BFS(i, j, true);
                    cnt[0]++;
                }
                if(!visited[i][j][1]) {
                    BFS(i, j, false);
                    cnt[1]++;
                }
            }
        }
        System.out.println(cnt[0] + " " + cnt[1]);
    }

    static void BFS(int x, int y, boolean isNormal) {
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(x, y));
        visited[x][y][isNormal ? 0 : 1] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny][isNormal ? 0 : 1]) continue;
                if((arr[node.x][node.y] == arr[nx][ny])
                || (!isNormal && ((arr[node.x][node.y] == 'G' && arr[nx][ny] == 'R')
                || (arr[node.x][node.y] == 'R' && arr[nx][ny] == 'G')))) {
                    que.add(new Node(nx, ny));
                    visited[nx][ny][isNormal ? 0 : 1] = true;
                }
            }
        }
    }
}
