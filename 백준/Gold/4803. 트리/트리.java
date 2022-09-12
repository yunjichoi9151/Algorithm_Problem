import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cnt = 0;

            if(n == 0 && m == 0) {
                break;
            }

            tree = new ArrayList[n + 1];

            for(int i = 0; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }

            for(int i = 0; i < m; i++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                tree[n1].add(n2);
                tree[n2].add(n1);
            }

            visit = new boolean[n + 1];

            for(int i = 1; i <= n; i++) {
                if(!visit[i] && dfs(i, 0)) {
                    cnt++;
                }
            }

            System.out.print("Case " + tc++ + ": ");
            if(cnt == 0) {
                System.out.println("No trees.");
            }
            else if(cnt == 1) {
                System.out.println("There is one tree.");
            }
            else {
                System.out.println("A forest of " + cnt + " trees.");
            }
        }
    }

    public static boolean dfs(int k, int r) {
        visit[k] = true;
        for(int i = 0; i < tree[k].size(); i++) {
            if(tree[k].get(i) == r)
                continue;
            if(visit[tree[k].get(i)])
                return false;
            if(!dfs(tree[k].get(i), k))
                return false;
        }
        
        return true;
    }
}