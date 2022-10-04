import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int s, e;
    double weight;

    public Edge(int s, int e, double weight) {
        this.s = s;
        this.e = e;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge e) {
        return Double.compare(this.weight, e.weight);
    }
}

public class Main {
    static int[] parent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] god = new int[n + 1][2];
        for(int i = 1; i <= n; i++) {
            god[i][0] = sc.nextInt();
            god[i][1] = sc.nextInt();
        }
        parent = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt(), e = sc.nextInt();
            union(s, e);
        }
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for(int i = 1; i < n; i++) {
            for(int j = i + 1; j < n + 1; j++) {
                int x1 = god[i][0], y1 = god[i][1], x2 = god[j][0], y2 = god[j][1];
                double weight = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                pq.add(new Edge(i, j, weight));
            }
        }
        double res = 0;
        while(!pq.isEmpty()) {
            Edge edge = pq.poll();
            if(union(edge.s, edge.e)) {
                res += edge.weight;
            }
        }
        System.out.println(String.format("%.2f", res));
        sc.close();
    }



    public static int find(int x) {
        if(parent[x] == x) {
            return x;
        } else {
            return parent[x] = find(parent[x]);
        }
    }

    public static boolean union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x != y) {
            parent[x] = y;
            return true;
        }
        return false;
    }
}