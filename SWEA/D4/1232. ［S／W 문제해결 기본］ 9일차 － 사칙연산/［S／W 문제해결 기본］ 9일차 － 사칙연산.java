import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    static String[] vertex;
    static int[][] edge;
    static int n;
    static int[] visit;
    static Stack<Integer> stack;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int tc = 1; tc <= 10; tc++) {
            n = Integer.parseInt(br.readLine());
            edge = new int[n + 1][n + 1];
            vertex = new String[n + 1];
            visit = new int[n + 1];
            stack = new Stack<>();
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                vertex[from] = st.nextToken();
                for(int j = 0; j < 2; j++) {
                    if(st.hasMoreTokens()) {
                        int to = Integer.parseInt(st.nextToken());
                        edge[from][to] = 1;
                    }
                }
            }
            dfs(1);
            sb.append("#" + tc + " " + stack.pop() + "\n");
        }
        System.out.println(sb);
    }

    public static void operation(String s) {
        if(s.equals("+")) {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b + a);
        } else if(s.equals("-")) {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b - a);
        } else if(s.equals("*")) {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b * a);
        } else if(s.equals("/")) {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b / a);
        } else {
            int num = Integer.parseInt(s);
            stack.push(num);
        }
    }

    public static void dfs(int x) {
        visit[x] = 1;
        for(int i = 1; i <= n; i++) {
            if(edge[x][i] == 1 && visit[i] == 0) {
                dfs(i);
            }
        }
        operation(vertex[x]);
    }
}