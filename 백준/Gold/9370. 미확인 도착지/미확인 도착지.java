import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int e, weight;
    public Edge(int e, int weight) {
        this.e = e;
        this.weight = weight;
    }
    @Override
    public int compareTo(Edge e) {
        return weight - e.weight;
    }
}

public class Main {
    static int n, m, t;
    static int[] dist;
    static int INF = 100000000;
    static List<List<Edge>> list;
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
                    list.get(a).add(new Edge(b, d * 2 - 1));
                    list.get(b).add(new Edge(a, d * 2 - 1));
                } else {
                    list.get(a).add(new Edge(b, d * 2));
                    list.get(b).add(new Edge(a, d * 2));
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
        }
        sc.close();
    }

    public static void dijkstra(int s) {
        boolean[] visit = new boolean[n + 1];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        dist[s] = 0;
        pq.add(new Edge(s, 0));
        while(!pq.isEmpty()) {
            Edge tmp = pq.poll();
            if(!visit[tmp.e]) {
                visit[tmp.e] = true;
                for(Edge edge : list.get(tmp.e)) {
                    if(!visit[edge.e] && dist[edge.e] > dist[tmp.e] + edge.weight) {
                        dist[edge.e] = dist[tmp.e] + edge.weight;
                        pq.add(new Edge(edge.e, dist[edge.e]));
                    }
                }
            }
        }
    }
}