import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int white, blue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    static void solve(int x, int y, int size) {
        if(check(x, y, size)) {
            if(map[x][y] == 0) white++;
            else blue++;
            return;
        }
        int half = size / 2;
        solve(x, y, half);
        solve(x, y + half, half);
        solve(x + half, y, half);
        solve(x + half, y + half, half);
    }

    static boolean check(int x, int y, int size) {
        int color = map[x][y];
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(map[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
