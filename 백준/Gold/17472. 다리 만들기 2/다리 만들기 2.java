import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] map;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int num = 2;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 1) {
                    map[i][j] = num;
                    dfs(i, j, num++);
                }
            }
        }
        int[][] distance = new int[num][num];
        for(int i = 2; i < num; i++) {
            Arrays.fill(distance[i], 999_999_999);
        }
        int prev = 0, zero = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] > 1) {
                    if(prev == 0) {
                        prev = map[i][j];
                    }
                    else {
                        if(prev != map[i][j] && zero > 1) {
                            int now = map[i][j];
                            distance[prev][now] = Math.min(distance[prev][now], zero);
                            distance[now][prev] = distance[prev][now];
                        }
                        prev = map[i][j];
                    }
                    zero = 0;
                }
                else {
                    zero++;
                }
            }
            prev = 0;
            zero = 0;
        }
        prev = 0;
        zero = 0;
        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                if(map[i][j] > 1) {
                    if(prev == 0) {
                        prev = map[i][j];
                    }
                    else {
                        if(prev != map[i][j] && zero > 1) {
                            int now = map[i][j];
                            distance[prev][now] = Math.min(distance[prev][now], zero);
                            distance[now][prev] = distance[prev][now];
                        }
                        prev = map[i][j];
                    }
                    zero = 0;
                }
                else {
                    zero++;
                }
            }
            prev = 0;
            zero = 0;
        }
        int res = 0;
        boolean visit[] = new boolean[num];
        visit[2] = true;
        for(int i = 3; i < num; i++) {
            int idx = -1;
            int min = 999_999_999;
            for(int j = 3; j < num ; j++) {
                if(!visit[j] && distance[2][j] < min) {
                    min = distance[2][j];
                    idx = j;
                }
            }
            if(min == 999_999_999) {
                res = -1;
                break;
            }
            res += min;
            visit[idx] = true;
            for(int j = 3; j < num; j++) {
                if(!visit[j]) {
                    distance[2][j] = Math.min(distance[2][j], distance[idx][j]);
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
    public static void dfs(int y, int x, int num) {
        for(int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(0 <= ny && ny < n && 0 <= nx && nx < m && map[ny][nx] == 1) {
                map[ny][nx] = num;
                dfs(ny, nx, num);
            }
        }
    }
}