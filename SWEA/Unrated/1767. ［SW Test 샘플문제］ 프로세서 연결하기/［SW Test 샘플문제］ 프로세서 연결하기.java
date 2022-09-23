import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    static int n, result, core_count;
    static int[][] map;
    static boolean[] isSelected;
    static ArrayList<Core> cores;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            map = new int[n][n];
            cores = new ArrayList<Core>();
            core_count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        continue;
                    }
                    if (map[i][j] == 1) {
                        cores.add(new Core(j, i));
                    }
                }
            }
            isSelected = new boolean[cores.size()];
            result = Integer.MAX_VALUE;
            subSet(0, 0);
            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
        sc.close();
    }

    static public void dfs(int current, int cnt, int dis, int[][] tmp) {
        if (current == cores.size()) {
            if (cnt == core_count) {
                result = Math.min(result, dis);
            } else if (cnt > core_count) {
                core_count = cnt;
                result = dis;
            }
            return;
        }
        if (isSelected[current]) {
            int x = cores.get(current).x;
            int y = cores.get(current).y;
            // 사방탐색
            for (int i = 0; i < 4; i++) {
                int tx = x;
                int ty = y;
                boolean flag = false;
                int[][] arr = copy(tmp);
                while (true) {
                    tx += dx[i];
                    ty += dy[i];
                    if (arr[ty][tx] == 1)
                        break;
                    if (tx == 0 || tx == n - 1 || ty == 0 || ty == n - 1) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    tx = x;
                    ty = y;
                    int length = 0;
                    while (true) {
                        tx += dx[i];
                        ty += dy[i];
                        if (tx < 0 || tx >= n || ty < 0 || ty >= n)
                            break;
                        length += 1;
                        arr[ty][tx] = 1;
                    }
                    dfs(current + 1, cnt, dis + length, arr);
                }
            }
        } else {
            dfs(current + 1, cnt, dis, tmp);
        }
    }

    static public void subSet(int current, int cnt) {
        if (current == cores.size()) {
            if (cnt >= core_count) {
                dfs(0, cnt, 0, copy(map));
            }
            return;
        }
        isSelected[current] = true;
        subSet(current + 1, cnt + 1);
        isSelected[current] = false;
        subSet(current + 1, cnt);
    }

    static public int[][] copy(int[][] arr) {
        int[][] tmp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i][j] = arr[i][j];
            }
        }
        return tmp;
    }

    static class Core {
        int x;
        int y;

        public Core(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}