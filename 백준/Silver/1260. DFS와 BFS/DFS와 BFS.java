import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[] visited;
    static TreeSet<Integer>[] arr;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        arr = new TreeSet[N + 1];
        visited = new boolean[N + 1];
        for(int i = 1; i <= N; i++) {
            arr[i] = new TreeSet<>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        // DFS
        DFS(K);
        System.out.println(sb.toString().trim());
        // BFS
        sb = new StringBuilder();
        visited = new boolean[N + 1];
        Queue<Integer> que = new LinkedList<>();
        que.add(K);
        visited[K] = true;
        while(!que.isEmpty()) {
            int x = que.poll();
            sb.append(x).append(" ");
            for(int num : arr[x]) {
                if(!visited[num]) {
                    que.add(num);
                    visited[num] = true;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }

    static void DFS(int node) {
        visited[node] = true;
        sb.append(node).append(" ");
        for(int x : arr[node]) {
            if(!visited[x]) {
                DFS(x);
            }
        }
    }
}
