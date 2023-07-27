import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static char tree[];
    public static int n;

    public static void inOrder(int now) {
        if(now > n) {
            return;
        }
        inOrder(now * 2);
        System.out.print(tree[now]);
        inOrder(now * 2 + 1);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int tc = 1; tc <= 10; tc++) {
            n = Integer.parseInt(br.readLine());
            tree = new char[n + 1];
            for(int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                int node = Integer.parseInt(st.nextToken());
                tree[node] = st.nextToken().charAt(0);
            }
            System.out.print("#" + tc + " ");
            inOrder(1);
            System.out.println();
        }
    }
}