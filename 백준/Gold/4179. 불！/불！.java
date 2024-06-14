import java.io.*;
import java.util.*;

public class Main {
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
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] map = new char[R][C];
        Queue<Node> que_F = new LinkedList<>();
        Queue<Node> que_J = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int answer = 0;
        for(int i = 0; i < R; i++) {
            String s = br.readLine();
            for(int j = 0; j < C; j++) {
                map[i][j] = s.charAt(j);
                if(map[i][j] == 'F') {
                    que_F.add(new Node(i, j, 0));
                } else if(map[i][j] == 'J') {
                    que_J.add(new Node(i, j, 0));
                }
            }
        }
        outerLoop:
        while(!que_J.isEmpty()) {
            int fireL = que_F.size();
            int jihunL = que_J.size();
            for(int k = 0; k < fireL; k++) {
                Node node = que_F.poll();
                for(int i = 0; i < 4; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == '#' || map[nx][ny] == '*') continue;
                    map[nx][ny] = '*';
                    que_F.add(new Node(nx, ny, node.time + 1));
                }
            }
            for(int k = 0; k < jihunL; k++) {
                Node node = que_J.poll();
                if(node.x == 0 || node.y == 0 || node.x == R - 1 || node.y == C - 1) {
                    answer = node.time + 1;
                    break outerLoop;
                }
                for(int i = 0; i < 4; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] != '.') continue;
                    map[nx][ny] = 'J';
                    que_J.add(new Node(nx, ny, node.time + 1));
                }
            }
        }
        System.out.println(answer == 0 ? "IMPOSSIBLE" : answer);
    }
}