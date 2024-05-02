import java.util.*;

public class Main {
    static class Node {
        int x, cnt;
        public Node(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int K = sc.nextInt();
        boolean[] visited = new boolean[2000000];
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(A, 0));
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == K) {
                System.out.println(node.cnt);
                return;
            }
            if(node.x + 1 <= K && !visited[node.x + 1]) {
                que.add(new Node(node.x + 1, node.cnt + 1));
                visited[node.x + 1] = true;
            }
            if(node.x * 2 <= K && !visited[node.x * 2]) {
                que.add(new Node(node.x * 2, node.cnt + 1));
                visited[node.x * 2] = true;
            }
        }
        sc.close();
    }
}