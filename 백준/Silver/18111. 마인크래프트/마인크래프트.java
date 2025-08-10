import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int max = 0;
        int min = 257;
        int[] ans = {Integer.MAX_VALUE, 0};
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(min > map[i][j]) min = map[i][j];
                if(max < map[i][j]) max = map[i][j];
            }
        }
        for(int n = max; n >= min; n--) {
            int cnt = B;
            int time = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(n > map[i][j]) {
                        cnt -= n - map[i][j];
                        time += n - map[i][j];
                    } else {
                        cnt += map[i][j] - n;
                        time += 2 * (map[i][j] - n);
                    }
                }
            }
            if(cnt >= 0 && time < ans[0]) {
                ans[0] = time;
                ans[1] = n;
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
