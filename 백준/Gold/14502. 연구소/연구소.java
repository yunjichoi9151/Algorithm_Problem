import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int answer = Integer.MIN_VALUE;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
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
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        map = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        dfs(0);
        System.out.println(answer);
    }

    static void dfs(int cnt) {
        if(cnt == 3) {
            bfs();
            return;
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(cnt + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        Queue<Node> que = new LinkedList<Node>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 2) que.add(new Node(i, j));
            }
        }
        int[][] tmpMap = new int[N][M];
        for(int i = 0; i < N; i++) {
            tmpMap[i] = Arrays.copyOf(map[i], M);
        }
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(tmpMap[nx][ny] == 0) {
                    que.add(new Node(nx, ny));
                    tmpMap[nx][ny] = 2;
                }
            }
        }
        findSafe(tmpMap);
    }

    static void findSafe(int[][] tmpMap) {
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(tmpMap[i][j] == 0) cnt++;
            }
        }
        answer = Math.max(answer, cnt);
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}