import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if(queue.size() > k) {
                queue.remove();
            }
            answer[i] = queue.peek();
        }
        return answer;
    }
}