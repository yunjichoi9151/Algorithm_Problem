import java.io.*;
import java.util.*;

public class Main {
    class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int divide = N;
        int[] cnt = new int[2];
        while(divide > 0) {
            for(int startX = 0; startX < N; startX += divide) {
                for(int startY = 0; startY < N; startY += divide) {
                    boolean isTrue = true;
                    outerLoop:
                    for(int i = startX; i < startX + divide; i++) {
                        for(int j = startY; j < startY + divide; j++) {
                            if(map[i][j] != map[startX][startY] || map[i][j] == -1) {
                                isTrue = false;
                                break outerLoop;
                            }
                        }
                    }
                    if(isTrue) {
                        cnt[map[startX][startY]]++;
                        for(int i = startX; i < startX + divide; i++) {
                            for(int j = startY; j < startY + divide; j++) {
                                map[i][j] = -1;
                            }
                        }
                    }
                }
            }
            divide /= 2;
        }
        System.out.println(cnt[0]);
        System.out.println(cnt[1]);
    }
}
