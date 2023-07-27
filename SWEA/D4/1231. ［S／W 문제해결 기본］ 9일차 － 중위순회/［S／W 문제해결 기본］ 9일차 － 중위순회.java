import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    static final int T = 10;

    static char[] tree;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(sc.nextLine());
            tree = new char[N+1];
            for (int i = 1; i <= N; i++) {
                String line = sc.nextLine();
                StringTokenizer st = new StringTokenizer(line);
                String num = st.nextToken();
                String str = st.nextToken();
                tree[i] = str.charAt(0);
            }
            System.out.printf("#%d ", t);
            traverse(1);
            System.out.println();
        }
        sc.close();
    }

    public static void traverse(int idx) {
        if(idx > N) return;

        traverse(idx*2);
        System.out.print(tree[idx]);
        traverse(idx*2+1);
    }
}