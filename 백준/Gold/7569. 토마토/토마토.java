import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int h;
        int x;
        int y;
        int day;
        public Node(int h, int x, int y, int day) {
            this.h = h;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Node> que = new LinkedList<Node>();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[][][] tomato = new int[H][N][M];
        boolean[][][] visited = new boolean[H][N][M];
        int[] arr = new int[3];
        int[] dh = {1, -1, 0, 0, 0, 0};
        int[] dx = {0, 0, 0, 0, 1, -1};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int ans = -1;
        for(int h = 0; h < H; h++) {
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < M; j++) {
                    int n = Integer.parseInt(st.nextToken());
                    tomato[h][i][j] = n;
                    arr[n + 1]++;
                    if(n == 1) {
                        que.add(new Node(h, i, j, 0));
                        visited[h][i][j] = true;
                    }
                }
            }
        }
        if(arr[2] == 0) {
            System.out.println(-1);
            return;
        } else if(arr[2] + arr[0] == M * N * H) {
            System.out.println(0);
            return;
        }
        outerLoop:
        while(!que.isEmpty()) {
            Node node = que.poll();
            for(int i = 0; i < 6; i++) {
                int nh = node.h + dh[i];
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(arr[1] == 0) {
                    ans = node.day + 1;
                    break outerLoop;
                }
                if(nh < 0 || nx < 0 || ny < 0 || nh >= H || nx >= N || ny >= M
                    || visited[nh][nx][ny] || tomato[nh][nx][ny] == -1) continue;
                arr[2]++;
                arr[1]--;
                que.add(new Node(nh, nx, ny, node.day + 1));
                visited[nh][nx][ny] = true;
            }
        }
        System.out.println(ans);
    }
}