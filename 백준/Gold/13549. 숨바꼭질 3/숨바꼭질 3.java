import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] time = new int[100001];
    static int[][] dx = {{2, 0}, {1, -1}, {1, 1}};
    static boolean visit[] = new boolean[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        if(k <= n) {
            System.out.println(n - k);
        } else {
            bfs(n, k);
            System.out.println(time[k]);
        }
        sc.close();
    }

    public static void bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        time[start] = 0;
        while(!queue.isEmpty()) {
            int tmp = queue.poll();
            for(int i = 0; i < 3; i++) {
                int x = dx[i][0] * tmp + dx[i][1] * 1;
                if(x < 0 || 100000 < x) {
                    continue;
                }
                if(!visit[x]) {
                    time[x] = time[tmp] + Math.abs(dx[i][1]);
                    queue.add(x);
                    visit[x] = true;
                }
            }
        }
    }
}