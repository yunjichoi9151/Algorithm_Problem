import java.io.*;
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        int answer = 0;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    static void dfs(int n) {
        if(visited[n]) return;
        visited[n] = true;
        for(int i = 1; i <= N; i++) {
            if(graph[n][i] == 1) {
                dfs(i);
            }
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}