import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x;
        int cnt;
        public Node(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int ans = 0;
        if(S == G) {
            System.out.println(0);
            return;
        }
        boolean[] visited = new boolean[F + 1];
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(S, 0));
        visited[S] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            int n1 = node.x + U;
            int n2 = node.x - D;
            if(n1 == G || n2 == G) {
                ans = node.cnt + 1;
                break;
            }
            if(n1 >= 1 && n1 <= F && !visited[n1]) {
                que.add(new Node(n1, node.cnt + 1));
                visited[n1] = true;
            }
            if(n2 >= 1 && n2 <= F && !visited[n2]) {
                que.add(new Node(n2, node.cnt + 1));
                visited[n2] = true;
            }
        }
        System.out.println(ans == 0 ? "use the stairs" : ans);
    }
}