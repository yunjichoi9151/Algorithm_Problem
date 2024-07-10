import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            que.add((100 - progresses[i] + speeds[i] - 1) / speeds[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!que.isEmpty()) {
            int day = que.poll();
            int cnt = 1;
            while (!que.isEmpty() && que.peek() <= day) {
                que.poll();
                cnt++;
            }
            list.add(cnt);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}