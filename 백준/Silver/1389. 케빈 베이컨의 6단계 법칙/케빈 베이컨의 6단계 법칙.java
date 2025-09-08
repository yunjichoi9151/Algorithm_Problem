import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, cnt;
        public Node(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] arr = new ArrayList[N + 1];
        int min = Integer.MAX_VALUE;
        int min_idx = 0;
        for(int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for(int i = 1; i <= N; i++) {
            Queue<Node> que = new LinkedList<>();
            boolean[] visited = new boolean[N + 1];
            que.add(new Node(i, 0));
            visited[i] = true;
            int sum = 0;
            while(!que.isEmpty()) {
                Node node = que.poll();
                sum += node.cnt;
                for(int num : arr[node.x]) {
                    if(!visited[num]) {
                        que.add(new Node(num, node.cnt + 1));
                        visited[num] = true;
                    }
                }
            }
            if(sum < min) {
                min = sum;
                min_idx = i;
            }
        }
        System.out.println(min_idx);
    }
}
