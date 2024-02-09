import java.io.*;
import java.util.*;

public class Main {
    static int L, R, C;
    static class Node {
        int h;
        int x;
        int y;
        int time;
        public Node(int h, int x, int y, int time) {
            this.h = h;
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine().trim();
            if(line.equals("0 0 0")) break;
            StringTokenizer st = new StringTokenizer(line);
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            char[][][] map = new char[L][R][C];
            boolean[][][] visited = new boolean[L][R][C];
            int[] start = new int[3];
            int[] dh = {0, 0, 0, 0, 1, -1};
            int[] dx = {0, 0, 1, -1, 0, 0};
            int[] dy = {1, -1, 0, 0, 0, 0};
            int ans = 0;
            for (int k = 0; k < L; k++) {
                for (int i = 0; i < R; i++) {
                    String row = br.readLine();
                    for (int j = 0; j < C; j++) {
                        map[k][i][j] = row.charAt(j);
                        if (map[k][i][j] == 'S') {
                            start[0] = k;
                            start[1] = i;
                            start[2] = j;
                        }
                    }
                }
                br.readLine();
            }
            Queue<Node> que = new LinkedList<>();
            que.add(new Node(start[0], start[1], start[2], 0));
            visited[start[0]][start[1]][start[2]] = true;
            outerLoop:
            while (!que.isEmpty()) {
                Node node = que.poll();
                for (int i = 0; i < 6; i++) {
                    int nh = node.h + dh[i];
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if (nh < 0 || nx < 0 || ny < 0 || nh >= L || nx >= R || ny >= C
                        || visited[nh][nx][ny] || map[nh][nx][ny] == '#') continue;
                    if (map[nh][nx][ny] == 'E') {
                        ans = node.time + 1;
                        break outerLoop;
                    }
                    que.add(new Node(nh, nx, ny, node.time + 1));
                    visited[nh][nx][ny] = true;
                }
            }
            sb.append((ans == 0 ? "Trapped!" : "Escaped in " + ans + " minute(s).") + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}