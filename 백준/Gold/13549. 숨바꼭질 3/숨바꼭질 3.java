import java.util.*;

public class Main {
    static class Node {
        int x;
        int time;
        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] visited = new boolean[100001];
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(N, 0));
        visited[N] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == K) {
                System.out.println(node.time);
                break;
            }
            if(node.x * 2 <= 100000 && !visited[node.x * 2]) {
                que.add(new Node(node.x * 2, node.time));
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
        sc.close();
    }
}