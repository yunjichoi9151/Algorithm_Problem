import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        R = stoi(st.nextToken());
        visited = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = stoi(st.nextToken());
            int v = stoi(st.nextToken());
            graph.get(u).add(v);
    		graph.get(v).add(u);
        }
        bfs(R);
        for(int i = 1; i <= N; i++) {
            System.out.println(visited[i]);
        }
    }

    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        int cnt = 1;
        que.add(start);
        visited[start] = cnt++;
        while(!que.isEmpty()) {
            int tmp = que.poll();
            Collections.sort(graph.get(tmp), Collections.reverseOrder());
            for(int next : graph.get(tmp)) {
                if(visited[next] != 0) continue;
                visited[next] = cnt++;
                que.add(next);
            }
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}