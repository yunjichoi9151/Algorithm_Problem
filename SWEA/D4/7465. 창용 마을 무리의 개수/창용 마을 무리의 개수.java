import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = stoi(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = stoi(st.nextToken());
            int M = stoi(st.nextToken());
            ArrayList<Integer>[] people = new ArrayList[N + 1];
            for(int i = 1; i <= N; i++) {
                people[i] = new ArrayList<>();
            }
            for(int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int n1 = stoi(st.nextToken());
                int n2 = stoi(st.nextToken());
                people[n1].add(n2);
                people[n2].add(n1);
            }
            Queue<Integer> que = new LinkedList<>();
            boolean[] visited = new boolean[N + 1];
            int ans = 0;
            for(int i = 1; i <= N; i++) {
                if(visited[i]) continue;
                que.add(i);
                visited[i] = true;
                while(!que.isEmpty()) {
                    int num = que.poll();
                    for(int nei : people[num]) {
                        if(!visited[nei]) {
                            que.add(nei);
                            visited[nei] = true;
                        }
                    }
                }
                ans++;
            }
            sb.append("#" + tc + " " + ans + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}
