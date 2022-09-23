import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int d, w, k, min;
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            d = sc.nextInt();
            w = sc.nextInt();
            k = sc.nextInt();
            map = new int[d][w];
            min = Integer.MAX_VALUE;
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            dfs(0, 0);
            System.out.println("#" + tc + " " + min);
        }
        sc.close();
    }

    public static void dfs(int n, int cnt) {
        if (cnt >= min) {
            return;
        }
        if (n == d) {
            loop: for (int i = 0; i < w; i++) {
                int count = 1;
                for (int j = 0; j < d - 1; j++) {
                    if (map[j][i] == map[j + 1][i]) {
                        count++;
                    } else {
                        count = 1;
                    }
                    if (count >= k) {
                        continue loop;
                    }
                }
                return;
            }
            min = Math.min(min, cnt);
            return;
        }
        int[] tmp = map[n].clone();
        dfs(n + 1, cnt);
        Arrays.fill(map[n], 0);
        dfs(n + 1, cnt + 1);
        Arrays.fill(map[n], 1);
        dfs(n + 1, cnt + 1);
        map[n] = tmp;
    }
}