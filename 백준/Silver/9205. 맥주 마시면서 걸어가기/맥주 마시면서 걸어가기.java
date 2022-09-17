import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<int[]> queue;
    static boolean[] visit;
    static int[][] arr;
    static int n, x1, y1, x2, y2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            n = sc.nextInt();
            arr = new int[n][2];
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            for(int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(Math.abs(x2 - x1) + Math.abs(y2 - y1) <= 1000) {
                System.out.println("happy");
            }
            else {
                System.out.println(BFS() ? "happy" : "sad");
            }
        }
        sc.close();
    }
    public static boolean BFS() {
        queue = new LinkedList<>();
        visit = new boolean[n];
        queue.add(new int[] {x1, y1});
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            if(Math.abs(x2 - tmp[0]) + Math.abs(y2 - tmp[1]) <= 1000) {
                return true;
            }
            for(int i = 0; i < n; i++) {
                if(!visit[i] && (Math.abs(arr[i][0] - tmp[0]) + Math.abs(arr[i][1] - tmp[1]) <= 1000)) {
                    visit[i] = true;
                    queue.add(new int[] {arr[i][0], arr[i][1]});
                }
            }
        }
        return false;
    }
}