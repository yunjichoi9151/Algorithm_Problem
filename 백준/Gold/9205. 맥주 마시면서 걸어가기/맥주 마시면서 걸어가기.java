import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int N, sx, sy, ex, ey;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = stoi(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            N = stoi(br.readLine());
            List<Node> list = new ArrayList<>();
            for(int i = 0; i < N + 2; i++) {
                st = new StringTokenizer(br.readLine());
                int x = stoi(st.nextToken());
                int y = stoi(st.nextToken());
                if(i == 0) {
                    sx = x;
                    sy = y;
                } else if(i == N + 1) {
                    ex = x;
                    ey = y;
                } else {
                    list.add(new Node(x, y));
                }
            }
            sb.append((BFS(list) ? "happy" : "sad") + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static boolean BFS(List<Node> list) {
        Queue<Node> que = new LinkedList<>();
        boolean[] visited = new boolean[N];
        que.add(new Node(sx, sy));
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(Math.abs(node.x - ex) + Math.abs(node.y - ey) <= 1000) return true;
            for(int i = 0; i < N; i++) {
                if(!visited[i]) {
                    if(Math.abs(node.x - list.get(i).x) + Math.abs(node.y - list.get(i).y) <= 1000) {
                        visited[i] = true;
                        que.add(new Node(list.get(i).x, list.get(i).y));
                    }
                }
            }
        }
        return false;
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}