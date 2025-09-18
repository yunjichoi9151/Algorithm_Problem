import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] list = new ArrayList[N + 1];
        int[] parent = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        Queue<Integer> que = new LinkedList<>();
        parent[1] = 1;
        que.add(1);
        while(!que.isEmpty()) {
            int node = que.poll();
            for(int num : list[node]) {
                if(parent[num] != 0) continue;
                parent[num] = node;
                que.add(num);
            }
        }
        for(int i = 2; i <= N; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.print(sb);
    }
}
