import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, time;
        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Node> que = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        que.add(new Node(N, 0));
        visited[N] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == K) {
                System.out.println(node.time);
                return;
            }
            if(node.x * 2 <= 100000 && !visited[node.x * 2]) {
                que.add(new Node(node.x * 2, node.time + 1));
                visited[node.x * 2] = true;
            } 
            if(node.x - 1 >= 0 && !visited[node.x - 1]) {
                que.add(new Node(node.x - 1, node.time + 1));
                visited[node.x - 1] = true;
            } 
            if(node.x + 1 <= 100000 && !visited[node.x + 1]) {
                que.add(new Node(node.x + 1, node.time + 1));
                visited[node.x + 1] = true;
            }
        }
    }
}
