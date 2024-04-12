import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R, min;
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        R = stoi(st.nextToken());
        min = Math.min(N, M);
        map = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        for(int i = 0; i < R; i++) {
            rotate();
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    static void rotate() {
        for(int t = 0; t < min / 2; t++) {
            int x = t;
            int y = t;
            int tmp = map[x][y];
            int idx = 0;
            while(idx < 4) {
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if(nx >= t && ny >= t && nx < N - t && ny < M - t) {
                    map[x][y] = map[nx][ny];
                    x = nx;
                    y = ny;
                } else {
                    idx++;
                }
            }
            map[t + 1][t] = tmp;
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}