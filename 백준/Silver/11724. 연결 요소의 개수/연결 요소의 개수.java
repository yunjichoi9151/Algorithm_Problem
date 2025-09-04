import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] arr = new ArrayList[N + 1];
        boolean[] visited = new boolean[N + 1];
        for(int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        Queue<Integer> que = new LinkedList<>();
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                que.add(i);
                visited[i] = true;
                cnt++;
                while (!que.isEmpty()) {
                    int node = que.poll();
                    for (int num : arr[node]) {
                        if (!visited[num]) {
                            visited[num] = true;
                            que.add(num);
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
