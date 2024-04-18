import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] parent;
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        parent = new int[N + 1];
        visited = new boolean[N + 1];
        for(int i = 0; i < N + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for(int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int idx) {
        visited[idx] = true;
        for(int i : list[idx]) {
            if(!visited[i]) {
                parent[i] = idx;
                dfs(i);
            }
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}