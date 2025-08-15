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
        int[] map = new int[101];
        boolean[] visited = new boolean[101];
        for(int i = 1; i <= 100; i++) {
            map[i] = i;
        }
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(1, 0));
        visited[1] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == 100) {
                System.out.println(node.cnt);
                return;
            }
            for(int i = 1; i <= 6; i++) {
                int nx = node.x + i;
                if(nx > 100) continue;
                nx = map[nx];
                if(!visited[nx]) {
                    que.add(new Node(nx, node.cnt + 1));
                    visited[nx] = true;
                }
            }
        }
    }
}
