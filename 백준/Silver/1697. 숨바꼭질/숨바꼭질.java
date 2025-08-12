import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] time = new int[100001];
        boolean[] visited = new boolean[100001];
        Queue<Integer> que = new LinkedList<>();
        que.add(N);
        visited[N] = true;
        while(!que.isEmpty()) {
            int now = que.poll();
            if(now == K) break;
            for(int next : new int[]{now - 1, now + 1, now * 2}) {
                if(next >= 0 && next <= 100000 && !visited[next]) {
                    que.add(next);
                    visited[next] = true;
                    time[next] = time[now] + 1;
                }
            }
        }
        System.out.println(time[K]);
    }
}
