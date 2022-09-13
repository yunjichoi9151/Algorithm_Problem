import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] store;
    static Queue<int[]> queue = new LinkedList<>();
    static int n;
    static int m;
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        store = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                store[i][j] = sc.nextInt();
                if(store[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        System.out.println(BFS());
    }

    public static int BFS() {
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int a = tmp[0];
            int b = tmp[1];
            for(int i = 0; i < 4; i++) {
                int x = a + dx[i];
                int y = b + dy[i];
                if(x < 0 || x >= n || y < 0 || y >= m) {
                    continue;
                }
                if(store[x][y] == 0) {
                    store[x][y] = store[a][b] + 1;
                    queue.add(new int[]{x, y});
                }
            }
        }
        int max = Integer.MIN_VALUE;
        if(checkZero()) {
            return -1;
        }
        else {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(max < store[i][j]) {
                        max = store[i][j];
                    }
                }
            }
            return max - 1;
        }
    }

    public static boolean checkZero() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(store[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}