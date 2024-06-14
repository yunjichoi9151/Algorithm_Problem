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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[N][N];
        boolean[][] visited;
        int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
        int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
        Queue<Node> que = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        for(int i = N - 2; i <= N - 1; i++)
            for(int j = 0; j <= 1; j++)
                que.add(new Node(i, j));
        for(int k = 0; k < M; k++) {
            visited = new boolean[N][N];
            st = new StringTokenizer(br.readLine());
            int D = stoi(st.nextToken()) - 1;
            int S = stoi(st.nextToken());
            int size = que.size();
            for(int i = 0; i < size; i++) {
                Node node = que.poll();
                int nx = (N + node.x + dx[D] * (S % N)) % N;
                int ny = (N + node.y + dy[D] * (S % N)) % N;
                que.add(new Node(nx, ny));
                visited[nx][ny] = true;
                map[nx][ny]++;
            }
            while(!que.isEmpty()) {
                Node node = que.poll();
                int cnt = 0;
                for(int i = 1; i <= 7; i += 2) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                    if(map[nx][ny] != 0) cnt++;
                }
                map[node.x][node.y] += cnt;
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j] >= 2 && !visited[i][j]) {
                        que.add(new Node(i, j));
                        map[i][j] -= 2;
                    }
                }
            }
        }
        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                answer += map[i][j];
            }
        }
        System.out.println(answer);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}