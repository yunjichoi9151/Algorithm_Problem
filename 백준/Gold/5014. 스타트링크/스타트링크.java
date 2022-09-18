import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<Node> queue;
    static boolean[] visit;
    static int f, s, g, u, d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        s = sc.nextInt();
        g = sc.nextInt();
        u = sc.nextInt();
        d = sc.nextInt();
        int ans = BFS();
        System.out.println(ans == -1 ? "use the stairs" : ans);
    }

    public static int BFS() {
        queue = new LinkedList<>();
        visit = new boolean[f + 1];
        queue.offer(new Node(s, 0));
        visit[s] = true;
        while(!queue.isEmpty()) {
            Node tmp = queue.poll();
            if(tmp.x == g) {
                return tmp.cnt;
            }
            if(tmp.x + u <= f && !visit[tmp.x + u]) {
                visit[tmp.x + u] = true;
                queue.offer(new Node(tmp.x + u, tmp.cnt + 1));
            }
            if(tmp.x - d > 0 && !visit[tmp.x - d]) {
                visit[tmp.x - d] = true;
                queue.offer(new Node(tmp.x - d, tmp.cnt + 1));
            }
        }
        return -1;
    }

    public static class Node {
        int x;
        int cnt;

        Node(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
}