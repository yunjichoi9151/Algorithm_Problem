import java.io.*;
import java.util.*;

public class Main {
    static int R, C, ans;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static class Node {
        int x, y, time;
        public Node(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int ans = 0;
        map = new char[R][C];
        Queue<Node> que_J = new LinkedList<Node>();
        Queue<Node> que_F = new LinkedList<Node>();
        for(int i = 0; i < R; i++) {
            String s = br.readLine();
            for(int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == 'J') {
                    que_J.add(new Node(i, j, 0));
                } else if(map[i][j] == 'F') {
                    que_F.add(new Node(i, j, 0));
                }
            }
        }
        outerLoop:
        while(!que_J.isEmpty()) {
            int size_F = que_F.size();
            int size_J = que_J.size();
            for(int i = 0; i < size_F; i++) {
                Node node = que_F.poll();
                for(int d = 0; d < 4; d++) {
                    int nx = node.x + dx[d];
                    int ny = node.y + dy[d];
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                    if(map[nx][ny] == 'J' || map[nx][ny] == '.') {
                        map[nx][ny] = 'F';
                        que_F.add(new Node(nx, ny, node.time + 1));
                    }
                }
            }
            for(int i = 0; i < size_J; i++) {
                Node node = que_J.poll();
                for(int d = 0; d < 4; d++) {
                    int nx = node.x + dx[d];
                    int ny = node.y + dy[d];
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        ans = node.time + 1;
                        break outerLoop;
                    }
                    if(map[nx][ny] == '.') {
                        map[nx][ny] = 'J';
                        que_J.add(new Node(nx, ny, node.time + 1));
                    }
                }
            }
        }
        System.out.println(ans == 0 ? "IMPOSSIBLE" : ans);
    }
}