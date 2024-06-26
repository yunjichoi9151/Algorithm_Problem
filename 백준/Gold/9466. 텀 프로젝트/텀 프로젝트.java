import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[] visited;
    static boolean[] finished;
    static int[] data;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine());
            data = new int[N + 1];
            visited = new boolean[N + 1];
            finished = new boolean[N + 1];
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                data[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i <= N; i++) {
                if (!finished[i]) {
                    dfs(i);
                }
            }
            int answer = N - count;
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    static void dfs(int node) {
        visited[node] = true;
        int next = data[node];
        if (!visited[next]) {
            dfs(next);
        } else if (!finished[next]) {
            for (int temp = next; temp != node; temp = data[temp]) {
                count++;
            }
            count++;
        }
        finished[node] = true;
    }
}