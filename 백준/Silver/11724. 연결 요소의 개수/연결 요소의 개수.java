import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        int ans = 0;
        for(int i = 1; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                DFS(i);
                ans++;
            }
        }
        System.out.println(ans);
    }

    static void DFS(int now) {
        visited[now] = true;
        for(int i : list[now]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
