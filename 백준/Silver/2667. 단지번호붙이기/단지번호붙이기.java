import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static boolean[][] visit;
    static ArrayList<Integer> list = new ArrayList<>();
    static int n;
    static int cnt = 0;
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visit = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(visit[i][j] == false && map[i][j] == 1) {
                    cnt++;
                    DFS(i, j);
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void DFS(int a, int b) {
        visit[a][b] = true;
        for(int i = 0; i < 4; i++) {
            int x = a + dx[i];
            int y = b + dy[i];

            if(x >= 0 && x < n && y >= 0 && y < n) {
                if(visit[x][y] == false && map[x][y] == 1) {
                    DFS(x, y);
                    cnt++;
                }
            }
        }
    }


}