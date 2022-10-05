import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<Node> arr = new ArrayList<Node>();
        long dist[] = new long[n + 1];
        boolean isCycle = false;
        Arrays.fill(dist, Long.MAX_VALUE);
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            long c = sc.nextLong();
            arr.add(new Node(a, b, c));
        }
        dist[1] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < m; j++) {
                int a = arr.get(j).start;
                int b = arr.get(j).end;
                long c = arr.get(j).time;
                if(dist[a] + c < dist[b] && dist[a] != Long.MAX_VALUE) {
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
                if(dist[i] == Long.MAX_VALUE) {
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
        int end;
        long time;
        public Node(int a, int b, long c) {
            start = a;
            end = b;
            time = c;
        }
    }
}