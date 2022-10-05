import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int e, weight;
    public Node(int e, int weight) {
        this.e = e;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node e) {
        return weight - e.weight;
    }
}

public class Main {
    static int n, m, t;
    static int[] dist;
    static int INF = 100000000;
    static List<List<Node>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            n = sc.nextInt();
            m = sc.nextInt();
            t = sc.nextInt();
            dist = new int[n + 1];
            Arrays.fill(dist, INF);
            list = new ArrayList<>();
            for(int i = 0; i < n + 1; i++) {
                list.add(new ArrayList<>());
            }
            int s = sc.nextInt(), g = sc.nextInt(), h = sc.nextInt();
            for(int i = 0; i < m; i++) {
                int a = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
                if((a == g && b == h) || (a == h && b == g)) {
                    list.get(a).add(new Node(b, d * 2 - 1));
                    list.get(b).add(new Node(a, d * 2 - 1));
                } else {
                    list.get(a).add(new Node(b, d * 2));
                    list.get(b).add(new Node(a, d * 2));
                }
            }
            ArrayList<Integer> candidate = new ArrayList<>();
            for(int i = 0; i < t; i++) {
                candidate.add(sc.nextInt());
            }
            dijkstra(s);
            Collections.sort(candidate);
            for(int i = 0; i < candidate.size(); i++) {
                if(dist[candidate.get(i)] % 2 == 1) {
                    System.out.print(candidate.get(i) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static void dijkstra(int s) {
        boolean[] visit = new boolean[n + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[s] = 0;
        pq.add(new Node(s, 0));
        while(!pq.isEmpty()) {
            Node tmp = pq.poll();
            if(!visit[tmp.e]) {
                visit[tmp.e] = true;
                for(Node node : list.get(tmp.e)) {
                    if(!visit[node.e] && dist[tmp.e] + node.weight < dist[node.e]) {
                        dist[node.e] = dist[tmp.e] + node.weight;
                        pq.add(new Node(node.e, dist[node.e]));
                    }
                }
            }
        }
    }
}