import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<Integer>[] list;
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        R = stoi(st.nextToken());
        list = new ArrayList[N + 1];
        visited = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = stoi(st.nextToken());
            int v = stoi(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        for(int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
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
            for(int i = 0; i < list[tmp].size(); i++) {
                int nextV = list[tmp].get(i);
                if(visited[nextV] != 0)
                    continue;
                que.offer(nextV);
                visited[nextV] = cnt++;
            }
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}