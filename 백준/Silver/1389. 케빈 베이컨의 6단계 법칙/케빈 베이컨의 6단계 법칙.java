import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static HashSet<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new HashSet[N + 1];
        for(int i = 1; i <= N; i++) {
            arr[i] = new HashSet<Integer>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 1; i <= N; i++) {
            int num = bfs(i);
            if(min > num) {
                min = num;
                ans = i;
            }
        }
        System.out.println(ans);
    }

    static int bfs(int start) {
        boolean[] visited = new boolean[N + 1];
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{start, 0});
        visited[start] = true;
        int sum = 0;
        while(!que.isEmpty()) {
            int[] node = que.poll();
            int now = node[0];
            int depth = node[1];
            sum += depth;
            for(int num : arr[now]) {
                if(!visited[num]) {
                    visited[num] = true;
                    que.add(new int[]{num, depth + 1});
                }
            }
        }
        return sum;
    }
}
