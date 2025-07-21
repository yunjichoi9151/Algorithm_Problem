import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] paint = new char[N][M];
        for(int i = 0; i < N; i++) {
            paint[i] = br.readLine().toCharArray();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= N - 8; i++) {
            for(int j = 0; j <= M - 8; j++) {
                int[] cnt = new int[2];
                for(int x = i; x < i + 8; x++) {
                    char now = x % 2 == 0 ? 'W' : 'B';
                    for(int y = j; y < j + 8; y++) {
                        if(paint[x][y] != now) cnt[0]++;
                        else cnt[1]++;
                        now = now == 'W' ? 'B' : 'W';
                    }
                }
                min = Math.min(min, Math.min(cnt[0], cnt[1]));
            }
        }
        System.out.println(min);
    }
}
