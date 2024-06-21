import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, d;
        public Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int M = stoi(st.nextToken());
        int[][] map = new int[N][M];
        int[] robot = new int[2];
        st = new StringTokenizer(br.readLine());
        robot[0] = stoi(st.nextToken());
        robot[1] = stoi(st.nextToken());
        int D = stoi(st.nextToken());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(robot[0], robot[1], D));
        int answer = 0;
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(map[node.x][node.y] == 0) {
                answer++;
                map[node.x][node.y] = 2;
            }
            boolean isClean = true;
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(map[nx][ny] == 0) {
                    isClean = false;
                    break;
                }
            }
            if(isClean) {
                int td = (node.d + 2) % 4;
                int nx = node.x + dx[td];
                int ny = node.y + dy[td];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] == 1) {
                    break;
                } else {
                    que.add(new Node(nx, ny, node.d));
                    continue;
                }
            } else {
                int td = (node.d + 3) % 4;
                int nx = node.x + dx[td];
                int ny = node.y + dy[td];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] != 0) {
                    que.add(new Node(node.x, node.y, td));
                } else {
                    que.add(new Node(nx, ny, td));
                }
            }
        }
        System.out.println(answer);
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}