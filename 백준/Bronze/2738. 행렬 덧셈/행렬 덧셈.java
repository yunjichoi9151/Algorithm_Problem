import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[N][M];
        for(int k = 0; k < 2; k++) {
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < M; j++) {
                    map[i][j] += stoi(st.nextToken());
                    if(k == 1) sb.append(map[i][j]);
                    if(j != M - 1) sb.append(" ");
                }
                if(k == 1) sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}
