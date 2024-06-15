import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, time;
        boolean broke;
        public Node(int x, int y, int time, boolean broke) {
            this.x = x;
            this.y = y;
            this.time = time;
            this.broke = broke;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[N][M];
        boolean[][][] visited = new boolean[N][M][2];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                map[i][j] = stoi(s.charAt(j) + "");
            }
        }
        int answer = -1;
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(0, 0, 0, false));
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == N - 1 && node.y == M - 1) {
                answer = node.time + 1;
                break;
            }
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (map[nx][ny] == 0 && !visited[nx][ny][node.broke ? 1 : 0]) {
                    que.add(new Node(nx, ny, node.time + 1, node.broke));
                    visited[nx][ny][node.broke ? 1 : 0] = true;
                } else if (map[nx][ny] == 1 && !node.broke && !visited[nx][ny][1]) {
                    que.add(new Node(nx, ny, node.time + 1, true));
                    visited[nx][ny][1] = true;
                }
            }
        }
        System.out.println(answer);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}