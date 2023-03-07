import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cnt = 0;
            Queue<int[]> queue = new LinkedList<>();
            for(int i = 0; i < n; i++) {
                queue.add(new int[]{i, sc.nextInt()});
            }
            while(!queue.isEmpty()) {
                int[] poll = queue.poll();
                boolean check = true;
                for(int[] tmp : queue) {
                    if(tmp[1] > poll[1]) {
                        check = false;
                    }
                }
                if(check) {
                    cnt++;
                    if(poll[0] == m) {
                        break;
                    }
                } else {
                    queue.add(poll);
                }
            }
            System.out.println(cnt);
        }
    }
}