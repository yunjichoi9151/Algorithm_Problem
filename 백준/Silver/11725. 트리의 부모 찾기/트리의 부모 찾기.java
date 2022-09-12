import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visit;
    static int[] parents;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            tree[n1].add(n2);
            tree[n2].add(n1);
        }
        
        visit = new boolean[n + 1];
        parents = new int[n + 1];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        visit[1] = true;
        while(queue.isEmpty() == false) {
            int x = queue.poll();
            for(int i : tree[x]) {
                if(visit[i] == false) {
                    visit[i] = true;
                    queue.add(i);
                    parents[i] = x;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
}