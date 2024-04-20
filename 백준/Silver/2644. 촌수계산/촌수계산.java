import java.io.*;
import java.util.*;

public class Main {
    static int N, M, n1, n2, res = -1;
    static int[] parent;
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = stoi(br.readLine());
        list = new ArrayList[N + 1];
        parent = new int[N + 1];
        visited = new boolean[N + 1];
        
        for(int i = 0; i < N + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = stoi(st.nextToken());
        n2 = stoi(st.nextToken());

        M = stoi(br.readLine());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        dfs(n1, n2, 0);

        System.out.println(res);
    }

    static void dfs(int start, int end, int cnt) {
        if(start == end) {
            res = cnt;
            return;
        }
        visited[start] = true;
        for(int i = 0; i < list[start].size(); i++) {
            int next = list[start].get(i);
            if(!visited[next]) dfs(next, end, cnt + 1);
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}