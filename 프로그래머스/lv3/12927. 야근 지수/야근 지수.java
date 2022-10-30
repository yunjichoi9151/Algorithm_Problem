import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < works.length; i++) {
            queue.offer(works[i]);
        }
        while(n > 0) {
            int work = queue.poll();
            queue.offer(work - 1);
            n--;
        }
        for(int i = 0; i < works.length; i++) {
            int a = queue.poll();
            if(a >= 0) {
                answer += (a * a);
            }
        }
        return answer;
    }
}