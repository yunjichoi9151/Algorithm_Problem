import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int ans = 0;
        while (N > 0) {
            int half = 1 << (N - 1);
            int quad = (r >= half ? 2 : 0) + (c >= half ? 1 : 0);
            ans += 1L * quad * half * half;
            if (r >= half) r -= half;
            if (c >= half) c -= half;
            N--;
        }
        System.out.println(ans);
    }
}
