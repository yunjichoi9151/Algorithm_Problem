import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Node> list = new ArrayList<>();
        double[][] map = new double[n][n];
        double[] minEdge = new double[n];
        boolean[] visit = new boolean[n];
        double res = 0;
        for(int i = 0; i < n; i++) {
            list.add(new Node(sc.nextDouble(), sc.nextDouble()));
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    map[i][j] = (double) Math.sqrt(Math.pow((list.get(j).x - list.get(i).x), 2) + Math.pow((list.get(j).y - list.get(i).y), 2));
                }
            }
        }
        Arrays.fill(minEdge, Integer.MAX_VALUE);
        minEdge[0] = 0;
        for(int i = 0; i < n; i++) {
            double min = Integer.MAX_VALUE;
            int minVertex = 0;
            for(int j = 0; j < n; j++) {
                if(!visit[j] && min > minEdge[j]) {
                    min = minEdge[j];
                    minVertex = j;
                }
            }
            res += min;
            visit[minVertex] = true;
            for(int j = 0; j < n; j++) {
                if(!visit[j] && map[minVertex][j] != 0 && minEdge[j] > map[minVertex][j]) {
                    minEdge[j] = map[minVertex][j];
                }
            }
        }
        System.out.println(String.format("%.2f", res));
        sc.close();
    }

    public static class Node{
        double x;
        double y;

        Node(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}