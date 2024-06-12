import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, z, time;
        public Node(int x, int y, int z, int time) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = stoi(st.nextToken());
        int R = stoi(st.nextToken());
        int C = stoi(st.nextToken());
        while(L != 0 && R != 0 && C != 0) {
            char[][][] map = new char[L][R][C];
            boolean[][][] visited = new boolean[L][R][C];
            int[] goal = new int[3];
            int[] dx = {-1, 1, 0, 0, 0, 0};
            int[] dy = {0, 0, -1, 1, 0, 0};
            int[] dz = {0, 0, 0, 0, -1, 1};
            Queue<Node> que = new LinkedList<>();
            for(int i = 0; i < L; i++) {
                for(int j = 0; j < R; j++) {
                    String s = br.readLine();
                    for(int k = 0; k < C; k++) {
                        map[i][j][k] = s.charAt(k);
                        if(map[i][j][k] == 'S') {
                            que.add(new Node(i, j, k, 0));
                            visited[i][j][k] = true;
                        }
                    }
                }
                String tmp = br.readLine();
            }
            int answer = -1;
            while(!que.isEmpty()) {
                Node node = que.poll();
                if(map[node.x][node.y][node.z] == 'E') {
                    answer = node.time;
                    break;
                }
                for(int i = 0; i < 6; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    int nz = node.z + dz[i];
                    if(nx < 0 || ny < 0 || nz < 0 || nx >= L || ny >= R || nz >= C || map[nx][ny][nz] == '#' || visited[nx][ny][nz]) continue;
                    que.add(new Node(nx, ny, nz, node.time + 1));
                    visited[nx][ny][nz] = true;
                }
            }
            sb.append((answer == -1 ? "Trapped!" : ("Escaped in " + answer + " minute(s).")) + "\n");
            st = new StringTokenizer(br.readLine());
            L = stoi(st.nextToken());
            R = stoi(st.nextToken());
            C = stoi(st.nextToken());
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}