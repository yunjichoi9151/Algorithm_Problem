import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static boolean[] visited;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        DFS(0);
        System.out.print(sb);
    }

    static void DFS(int depth) {
        if(depth == M) {
            for(int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if(i != list.size() - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                list.add(i);
                DFS(depth + 1);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
