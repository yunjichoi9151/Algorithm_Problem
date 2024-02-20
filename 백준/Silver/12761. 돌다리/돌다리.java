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
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] dx = {1, -1, A, -A, B, -B};
        int[] dx2 = {A, B};
        boolean[] visited = new boolean[100001];
        Queue<Node> que = new LinkedList<Node>();
        que.add(new Node(N, 0));
        visited[N] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == M) {
                System.out.println(node.time);
                break;
            }
            for(int i = 0; i < 6; i++) {
                int nx = node.x + dx[i];
                if(nx < 0 || nx > 100000 || visited[nx]) continue;
                que.add(new Node(nx, node.time + 1));
                visited[nx] = true;
            }
            for(int i = 0; i < 2; i++) {
                int nx = node.x * dx2[i];
                if(nx < 0 || nx > 100000 || visited[nx]) continue;
                que.add(new Node(nx, node.time + 1));
                visited[nx] = true;
            }
        }
        sc.close();
    }
}