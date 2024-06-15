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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = stoi(st.nextToken());
        int C = stoi(st.nextToken());
        int T = stoi(st.nextToken());
        int[][] map = new int[R][C];
        int[][] new_map = new int[R][C];
        int[] air = {-1, -1};
        Queue<Node> que = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < C; j++) {
                map[i][j] = stoi(st.nextToken());
                if(map[i][j] == -1) {
                    if(air[0] == -1) {
                        air[0] = i;
                        air[1] = i + 1;
                    }
                } else if(map[i][j] > 0) {
                    que.add(new Node(i, j));
                }
            }
        }
        int answer = 0;
        for(int tc = 0; tc < T; tc++) {
            new_map = new int[R][C];
            int size = que.size();
            for(int k = 0; k < size; k++) {
                Node node = que.poll();
                int dirty = map[node.x][node.y] / 5;
                int cnt = 0;
                for(int i = 0; i < 4; i++) {
                    int nx = node.x + dx[i];
                    int ny = node.y + dy[i];
                    if(nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == -1) continue;
                    cnt++;
                    new_map[nx][ny] += dirty;
                }
                new_map[node.x][node.y] += map[node.x][node.y] - dirty * cnt;
            }
            int tmp = new_map[0][0];
            for(int j = 1; j < C; j++) new_map[0][j - 1] = new_map[0][j];
            for(int i = 1; i <= air[0]; i++) new_map[i - 1][C - 1] = new_map[i][C - 1];
            for(int j = C - 2; j >= 0; j--) new_map[air[0]][j + 1] = new_map[air[0]][j];
            for(int i = air[0] - 1; i > 0; i--) new_map[i + 1][0] = new_map[i][0];
            new_map[1][0] = tmp;
            tmp = new_map[air[1]][C - 1];
            for(int j = C - 2; j >= 0; j--) new_map[air[1]][j + 1] = new_map[air[1]][j];
            for(int i = air[1] + 1; i < R; i++) new_map[i - 1][0] = new_map[i][0];
            for(int j = 1; j < C; j++) new_map[R - 1][j - 1] = new_map[R - 1][j];
            for(int i = R - 2; i > air[1]; i--) new_map[i + 1][C - 1] = new_map[i][C - 1];
            new_map[air[1] + 1][C - 1] = tmp;
            for(int i = 0; i < R; i++) {
                for(int j = 0; j < C; j++) {
                    if(j == 0 && (i == air[0] || i == air[1])) continue;
                    map[i][j] = new_map[i][j];
                    if(map[i][j] > 0) que.add(new Node(i, j));
                }
            }
        }
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(map[i][j] > 0) answer += map[i][j];
            }
        }
        System.out.println(answer);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}