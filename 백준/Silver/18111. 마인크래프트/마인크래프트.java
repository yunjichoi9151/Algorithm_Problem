import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int[][] map = new int[N][M];
        int min = 257;
        int max = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(min > map[i][j]) min = map[i][j];
                if(max < map[i][j]) max = map[i][j];
            }
        }
        int height = 0;
        Long min_time = Long.MAX_VALUE;
        for(int t = max; t >= min; t--) {
            long extra = 0, need = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    int h = map[i][j];
                    if(h > t) extra += h - t;
                    else need += t - h;
                }
            }
            if(need <= extra + B) {
                long time = 2 * extra + need;
                if(time < min_time) {
                    min_time = time;
                    height = t;
                }
            }
        }
        System.out.println(min_time + " " + height);
    }
}
