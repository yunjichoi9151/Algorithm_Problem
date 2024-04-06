import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static Queue<Node> que = new LinkedList<Node>();
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
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        que.add(new Node(N - 1, 0));
        que.add(new Node(N - 1, 1));
        que.add(new Node(N - 2, 0));
        que.add(new Node(N - 2, 1));
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken()) - 1;
            int s = Integer.parseInt(st.nextToken());
            step12(d, s);
            step34();
            step5();
        }
        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                answer += map[i][j];
            }
        }
        System.out.println(answer);
    }
    static void step12(int d, int s) {
        for(Node node : que) {
            node.x = (N + node.x + dx[d] * (s % N)) % N;
            node.y = (N + node.y + dy[d] * (s % N)) % N;
            map[node.x][node.y]++;
        }
    }
    static void step34() {
        while(!que.isEmpty()) {
            Node node = que.poll();
            int cnt = 0;
            visited[node.x][node.y] = true;
            for(int i = 1; i <= 7; i += 2) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if(map[nx][ny] > 0) cnt++;
            }
            map[node.x][node.y] += cnt;
        }
    }
    static void step5() {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] >= 2 && !visited[i][j]) {
                    que.add(new Node(i, j));
                    map[i][j] -= 2;
                }
            }
        }
        visited = new boolean[N][N];
    }
}