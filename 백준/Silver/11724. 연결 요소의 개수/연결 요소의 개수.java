import java.util.Scanner;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int n, cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        for(int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;
            arr[v][u] = 1;
        }
        cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                DFS(i);
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }

    public static void DFS(int v) {
        if(visited[v]) return;
        visited[v] = true;
        for(int i = 1; i <= n; i++) {
            if(arr[v][i] == 1) {
                DFS(i);
            }
        }
    }
}