import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, 1};
    static int[] dy = {0, 1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int half = (int)Math.pow(2, N) / 2;
        int ans = 0;
        while(half > 0) {
            ans += ((r < half ? 0 : 2) + (c < half ? 0 : 1)) * (half * half);
            if(r >= half) r -= half;
            if(c >= half) c -= half;
            half /= 2;
        }
        System.out.println(ans);
    }
}
