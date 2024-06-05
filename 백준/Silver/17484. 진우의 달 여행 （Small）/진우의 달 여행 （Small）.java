import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, cost, before;
        public Node(int x, int y, int cost, int before) {
            this.x = x;
            this.y = y;
            this.cost = cost;
            this.before = before;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[N][M];
        Queue<Node> que = new LinkedList<Node>();
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = stoi(st.nextToken());
                if(i == 0)
                    que.add(new Node(0, j, map[i][j], -2));
            }
        }
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == N - 1) {
                answer = Math.min(answer, node.cost);
            }
            for(int i = -1; i <= 1; i++) {
                if(i != node.before) {
                    int nx = node.x + 1;
                    int ny = node.y + i;
                    if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                    que.add(new Node(nx, ny, node.cost + map[nx][ny], i));
                }
            }
        }
        System.out.println(answer);
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}