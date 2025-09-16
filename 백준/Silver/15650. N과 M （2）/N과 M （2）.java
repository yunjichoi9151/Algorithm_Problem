import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        DFS(0, 1);
        System.out.print(sb);
    }

    static void DFS(int depth, int start) {
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(arr[i]);
                if(i != M - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = start; i <= N; i++) {
            arr[depth] = i;
            DFS(depth + 1, i + 1);
        }
    }
}
