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
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[F + 1];
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(S, 0));
        visited[S] = true;
        int answer = -1;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == G) {
                answer = node.cnt;
                break;
            }
            if(node.x + U <= F && !visited[node.x + U]) {
                que.add(new Node(node.x + U, node.cnt + 1));
                visited[node.x + U] = true;
            }
            if(node.x - D >= 1 && !visited[node.x - D]) {
                que.add(new Node(node.x - D, node.cnt + 1));
                visited[node.x - D] = true;
            }
        }
        System.out.println(answer == -1 ? "use the stairs" : answer);
    }
}