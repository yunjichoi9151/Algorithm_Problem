import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Node>[] tree;
    static boolean[] visit;
    static int max = 0, idx = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for(int i = 0; i < n; i++) {
            int start = sc.nextInt();
            while(true) {
                int x = sc.nextInt();
                if(x == -1) {
                    break;
                }
                int w = sc.nextInt();
                tree[start].add(new Node(x, w));
            }
        }

        visit = new boolean[n + 1];
        dfs(1, 0);
        visit = new boolean[n + 1];
        dfs(idx, 0);
        System.out.println(max);
    }

    public static void dfs(int k, int sum) {
        visit[k] = true;
        if(max < sum) {
            max = sum;
            idx = k;
        }
        for(int i = 0; i < tree[k].size(); i++) {
            if(!visit[tree[k].get(i).x]) {
                dfs(tree[k].get(i).x, tree[k].get(i).w + sum);
            }
        }
    }

    public static class Node {
        int x;
        int w;

        Node(int x, int w) {
            this.x = x;
            this.w = w;
        }
    }
}