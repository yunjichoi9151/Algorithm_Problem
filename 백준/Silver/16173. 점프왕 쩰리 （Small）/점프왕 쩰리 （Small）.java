import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N ;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(check ? "HaruHaru" : "Hing");
        br.close();
    }

    static void dfs(int i, int j) {
        if(visited[i][j]) return;
        visited[i][j] = true;
        if(map[i][j] == -1) {
            check = true;
            return;
        }
        if(i + map[i][j] < N) {
            dfs(map[i][j] + i, j);
        }
        if(j + map[i][j] < N) {
            dfs(i, map[i][j] + j);
        }
    }
}