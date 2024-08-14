import java.io.*;
import java.util.*;

public class Solution {
    static int N;
    static char[] tree;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        for(int tc = 1; tc <= 10; tc++) {
            sb.append("#" + tc + " ");
            N = Integer.parseInt(br.readLine());
            tree = new char[N + 1];
            for(int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                tree[i] = st.nextToken().charAt(0);
            }
            inOrder(1);
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    static void inOrder(int idx) {
        if(idx > N) return;
        inOrder(idx * 2);
        sb.append(tree[idx]);
        inOrder(idx * 2 + 1);
    }
}