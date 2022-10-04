import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<Node> adj = new ArrayList<Node>();
        long dist[] = new long[n + 1];
        boolean isCycle = false;
        for(int i = 1; i <= n; i++) {
            dist[i] = 987654321;
        }
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            long c = sc.nextLong();
            adj.add(new Node(a, b, c));
        }
        dist[1] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < m; j++) {
                int a = adj.get(j).start;
                int b = adj.get(j).dest;
                long c = adj.get(j).cost;
                if(dist[b] > dist[a] + c && dist[a] != 987654321) {
                    if(i == n) {
                        isCycle = true;
                    }
                    dist[b] = dist[a] + c;
                }
            }
        }
        if(isCycle) {
            System.out.println(-1);
        } else {
            for(int i = 2; i <= n; i++) {
                if(dist[i] == 987654321) {
                    System.out.println(-1);
                } else {
                    System.out.println(dist[i]);
                }
            }
        }
        sc.close();
    }

    public static class Node {
        int start;
        int dest;
        long cost;
        public Node(int c, int a, long b) {
            start = c;
            dest = a;
            cost = b;
        }
    }
}