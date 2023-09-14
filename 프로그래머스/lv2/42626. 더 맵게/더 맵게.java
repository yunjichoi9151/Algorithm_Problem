import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int cnt = 0;
        for(int n : scoville) {
            heap.add(n);
            if(n >= K) cnt++;
        }
        if(cnt == scoville.length) return 0;
        while(heap.size() > 1) {
            int min1 = heap.remove();
            int min2 = heap.remove();
            heap.add(min1 + min2 * 2);
            boolean isTrue = true;
            for(int n : heap) {
                if(n < K) {
                    isTrue = false;
                    break;
                }
            }
            answer++;
            if(isTrue) break;
        }
        return heap.size() == 1 && heap.remove() < K ? -1 : answer;
    }
}