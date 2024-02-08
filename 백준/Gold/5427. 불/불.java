import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x;
        int y;
        int time;
        public Node(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            char[][] map = new char[h][w];
            boolean[][] visited = new boolean[h][w];
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};
            Queue<Node> que_F = new LinkedList<>();
            Queue<Node> que_S = new LinkedList<>();
            int ans = 0;
            for(int i = 0; i < h; i++) {
                String s = br.readLine();
                for(int j = 0; j < w; j++) {
                    char c = s.charAt(j);
                    map[i][j] = c;
                    if(c == '*') que_F.add(new Node(i, j, 0));
                    else if(c == '@') que_S.add(new Node(i, j, 0));
                }
            }
            outerLoop:
            while(!que_S.isEmpty()) {
                int size_F = que_F.size();
                int size_S = que_S.size();
                for(int k = 0; k < size_F; k++) {
                    Node node = que_F.poll();
                    for(int i = 0; i < 4; i++) {
                        int nx = node.x + dx[i];
                        int ny = node.y + dy[i];
                        if(nx < 0 || ny < 0 || nx >= h || ny >= w || map[nx][ny] == '#' || map[nx][ny] == '*') continue;
                        map[nx][ny] = '*';
                        que_F.add(new Node(nx, ny, node.time + 1));
                    }
                }
                for(int k = 0; k < size_S; k++) {
                    Node node = que_S.poll();
                    for(int i = 0; i < 4; i++) {
                        int nx = node.x + dx[i];
                        int ny = node.y + dy[i];
                        if(nx < 0 || ny < 0 || nx >= h || ny >= w) {
                            ans = node.time + 1;
                            break outerLoop;
                        }
                        if(!visited[nx][ny] && map[nx][ny] == '.') {
                            que_S.add(new Node(nx, ny, node.time + 1));
                            visited[nx][ny] = true;
                        }
                    }
                }
            }
            sb.append((ans == 0 ? "IMPOSSIBLE" : ans) + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}