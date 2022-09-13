import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static boolean tree[][];
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int cnt = 0;
        tree = new boolean[n + 1][n + 1];
        for(int i = 0; i < m; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            tree[n1][n2] = true;
            tree[n2][n1] = true;
        }
        visit = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        visit[1] = true;
        while(!queue.isEmpty()) {
            int x = queue.poll();
            for(int i = 1; i < tree.length; i++) {
                if(!visit[i] && tree[x][i]) {
                    visit[i] = true;
                    queue.add(i);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}