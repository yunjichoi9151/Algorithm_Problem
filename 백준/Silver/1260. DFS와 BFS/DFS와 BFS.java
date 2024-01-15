import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, V;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][N + 1];
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            arr[n1][n2] = 1;
            arr[n2][n1] = 1;
        }
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();
        visited = new boolean[N + 1];
        bfs(V);
    }
    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        if(v == N + 1) return;
        for(int i = 1; i <= N; i++) {
            if(arr[v][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }
    private static void bfs(int v) {
        Queue<Integer> que = new LinkedList<Integer>();
        que.offer(v);
        visited[v] = true;
        System.out.print(v + " ");
        while(!que.isEmpty()) {
            int num = que.poll();
            for(int i = 1; i <= N; i++) {
                if(arr[num][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    System.out.print(i + " ");
                    que.offer(i);
                }
            }
        }
    }
}