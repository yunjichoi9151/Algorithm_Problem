import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] conn;
    static boolean[] visit;
    static int[] plan;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        boolean res = true;

        conn = new int[n][n];
        visit = new boolean[n];
        plan = new int[m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                conn[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++) {
            plan[i] = sc.nextInt() - 1;
        }

        dfs(plan[0]);
        
        for(int i = 0; i < m; i++) {
            if(!visit[plan[i]]) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "YES" : "NO");
        sc.close();
    }

    public static void dfs(int num) {
        visit[num] = true;
        for(int i = 0; i < n; i++) {
            if(conn[num][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}