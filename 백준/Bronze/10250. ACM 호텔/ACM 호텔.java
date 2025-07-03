import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = stoi(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = stoi(st.nextToken());
            int W = stoi(st.nextToken());
            int N = stoi(st.nextToken());
            if(N % H == 0) sb.append(H * 100 + (N / H) + "\n");
            else sb.append((N % H) * 100 + (N / H + 1) + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}
