import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr, tmp;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        tmp = new int[M];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        DFS(0);
        System.out.print(sb);
    }

    static void DFS(int depth) {
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(tmp[i]);
                if(i != M - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            tmp[depth] = arr[i];
            DFS(depth + 1);
            visited[i] = false;
        }
    }
}
