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
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Node> que = new LinkedList<>();
        check = new boolean[100001];
        que.add(new Node(N, 0));
        check[N] = true;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == K) {
                System.out.println(node.cnt);
                return;
            }
            if(check(node.x - 1)) {
                que.add(new Node(node.x - 1, node.cnt + 1));
                check[node.x - 1] = true;
            }
            if(check(node.x + 1)) {
                que.add(new Node(node.x + 1, node.cnt + 1));
                check[node.x + 1] = true;
            }
            if(check(node.x * 2)) {
                que.add(new Node(node.x * 2, node.cnt + 1));
                check[node.x * 2] = true;
            }
        }
    }

    static boolean check(int n) {
        if(n >= 0 && n <= 100000 && !check[n]) return true;
        else return false;
    }
}
