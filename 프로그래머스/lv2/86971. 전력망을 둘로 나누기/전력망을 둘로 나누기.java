import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static ArrayList<Integer> arr[];
    public int solution(int n, int[][] wires) {
        int ans = 10000;
        int len = wires.length;
        arr = new ArrayList[n + 1];
        for(int i = 1; i < n + 1; i++) {
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i < len; i++) {
            arr[wires[i][0]].add(wires[i][1]);
            arr[wires[i][1]].add(wires[i][0]);
        }
        for(int i = 0; i < len; i++) {
            int tmp1 = bfs(wires[i][0], wires[i][1], n);
            int tmp2 = bfs(wires[i][1], wires[i][0], n);
            ans = Math.min(ans, Math.abs(tmp1 - tmp2));
        }
        return ans;
    }

    public static int bfs(int wire1, int wire2, int n) {
        Queue<Integer> que = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];
        int cnt = 0;
        que.add(wire1);
        visit[wire1] = true;

        while(!que.isEmpty()) {
            int tmp = que.poll();
            cnt++;
            for(int i : arr[tmp]) {
                if(!visit[i] && i != wire2) {
                    visit[i] = true;
                    que.add(i);
                }
            }
        }
        return cnt;
    }
}