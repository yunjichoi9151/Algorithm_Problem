import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, ans = 0;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[] baby = {0, 0, 2, 0};
    static boolean[][] visit;
    static Queue <int[]> queue = new LinkedList<>();
    private static PriorityQueue <int[]> sharks;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visit = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] == 9) {
                    baby[0] = i;
                    baby[1] = j;
                    map[i][j] = 0;
                    visit[i][j] = true;
                    queue.offer(new int[] {i, j, 0});
                }
            }
        }
        sharks = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        bfs();
        System.out.println(ans);
        sc.close();
    }

    public static void bfs() {
        while(!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int d = queue.poll()[2];
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n || visit[nx][ny] || map[nx][ny] > baby[2]) {
                    continue;
                }
                if(map[nx][ny] > 0 && map[nx][ny] < baby[2]) {
                    sharks.offer(new int[] {nx, ny, d + 1});
                }
                queue.offer(new int[] {nx, ny, d + 1});
                visit[nx][ny] = true;
            }
            if(sharks.size() > 0 && (queue.isEmpty() || d != queue.peek()[2])) {
                int nx = sharks.peek()[0];
                int ny = sharks.peek()[1];
                baby[0] = nx;
                baby[1] = ny;
                map[nx][ny] = 0;
                if(++baby[3] == baby[2]) {
                    baby[2]++;
                    baby[3] = 0;
                }
                ans += sharks.poll()[2];
                queue.clear();
                sharks.clear();
                queue.offer(new int[] {nx, ny, 0});
                visit = new boolean[n][n];
                visit[nx][ny] = true;
            }
        }
    }
}