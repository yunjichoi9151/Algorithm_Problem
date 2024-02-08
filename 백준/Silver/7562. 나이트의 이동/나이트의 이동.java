import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x;
        int y;
        int move;
        public Node(int x, int y, int move) {
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            int I = Integer.parseInt(br.readLine());
            boolean[][] map = new boolean[I][I];
            Queue<Node> que = new LinkedList<Node>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] start = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            que.add(new Node(start[0], start[1], 0));
            st = new StringTokenizer(br.readLine());
            int[] end = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
            int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
            while(!que.isEmpty()) {
                Node node = que.poll();
                if(node.x == end[0] && node.y == end[1]) {
                    sb.append(node.move + "\n");
                    break;
                }
                for(int i = 0; i < 8; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= I || ny >= I || map[nx][ny]) continue;
                    que.add(new Node(nx, ny, node.move + 1));
                    map[nx][ny] = true;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}