import java.io.*;
import java.util.*;

public class Main {
    static long A, B;
    static class Node {
        long x, cnt;
        public Node(long x, long cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        Queue<Node> que = new LinkedList<>();
        ArrayList<Long> visited = new ArrayList<>();
        que.add(new Node(B, 1));
        visited.add(B);
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == A) {
                System.out.println(node.cnt);
                return;
            }
            if(node.x % 10 == 1 && !visited.contains(node.x / 10) && node.x / 10 >= A) {
                que.add(new Node(node.x / 10, node.cnt + 1));
                visited.add(node.x / 10);
            }
            if(node.x % 2 == 0 && !visited.contains(node.x / 2) && node.x / 2 >= A) {
                que.add(new Node(node.x / 2, node.cnt + 1));
                visited.add(node.x / 2);
            }
        }
        System.out.println(-1);
    }
}
