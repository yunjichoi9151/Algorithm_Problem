import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x1 = N % H == 0 ? H : N - H * (N / H);
            int x2 = N % H == 0 ? N / H :  N / H + 1;
            sb.append(x1 * 100 + x2 + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}