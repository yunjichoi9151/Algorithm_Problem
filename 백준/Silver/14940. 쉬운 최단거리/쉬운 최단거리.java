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
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int[][] ans = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        int[] goal = new int[2];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2) {
                    goal[0] = i;
                    goal[1] = j;
                }
            }
        }
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(goal[0], goal[1], 0));
        visited[goal[0]][goal[1]] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            ans[node.x][node.y] = node.cnt;
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 0) continue;
                que.add(new Node(nx, ny, node.cnt + 1));
                visited[nx][ny] = true;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 0) sb.append(ans[i][j]);
                else if(!visited[i][j]) sb.append(-1);
                else sb.append(ans[i][j]);
                if(j != M - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
