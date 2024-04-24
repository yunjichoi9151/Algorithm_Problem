import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R;
    static ArrayList<Integer>[] list;
    static int[] cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        R = stoi(st.nextToken());
        list = new ArrayList[N + 1];
        cnt = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
            cnt[i] = -1;
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = stoi(st.nextToken());
            int v = stoi(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        bfs(R);
        for(int i = 1; i <= N; i++) {
            System.out.println(cnt[i]);
        }
    }

    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        cnt[start] = 0;
        while(!que.isEmpty()) {
            int tmp = que.poll();
            for(int i = 0; i < list[tmp].size(); i++) {
                int nextV = list[tmp].get(i);
                if(cnt[nextV] == -1) {
                    cnt[nextV] = cnt[tmp] + 1;
                    que.add(nextV);
                }
            }
        }
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}