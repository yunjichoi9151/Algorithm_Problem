import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int x, y, m, s, d;
        public Node(int x, int y, int m, int s, int d) {
            this.x = x;
            this.y = y;
            this.m = m;
            this.s = s;
            this.d = d;
        }
    }
    static int N, M, K;
    static ArrayList<Node>[][] map;
    static ArrayList<Node> fireball = new ArrayList<Node>();
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new ArrayList[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                map[i][j] = new ArrayList<Node>();
            }
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            fireball.add(new Node(r, c, m, s, d));
        }
        for(int t = 0; t < K; t++) {
            for(Node node :fireball) {
                node.x = (N + node.x + dx[node.d] * (node.s % N)) % N;
                node.y = (N + node.y + dy[node.d] * (node.s % N)) % N;
                map[node.x][node.y].add(node);
            }
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j].size() < 2) {
                        map[i][j].clear();
                        continue;
                    }
                    int mSum = 0, sSum = 0, oddCnt = 0, evenCnt = 0;
                    int size = map[i][j].size();
                    for(Node node : map[i][j]) {
                        mSum += node.m;
                        sSum += node.s;
                        if(node.d % 2 == 0) evenCnt++;
                        else oddCnt++;
                        fireball.remove(node);
                    }
                    map[i][j].clear();
                    mSum /= 5;
                    sSum /= size;
                    if(mSum == 0) continue;
                    int start = (oddCnt == size || evenCnt == size) ? 0 : 1;
                    for(int k = start; k < 8; k += 2) {
                        fireball.add(new Node(i, j, mSum, sSum, k));
                    }
                }
            }
        }
        int answer = 0;
        for(Node node : fireball) {
            answer += node.m;
        }
        System.out.println(answer);
    }
}