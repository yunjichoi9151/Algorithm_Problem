import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int idx = priorities.length - 1;
        for(int n : priorities) {
            queue.add(n);
        }
        Arrays.sort(priorities);
        while(!queue.isEmpty()) {
            if(queue.peek() == priorities[idx]) {
                queue.remove();
                idx--;
                answer++;
                if(location == 0) {
                    break;
                }
            } else {
                queue.add(queue.peek());
                queue.remove();
            }
            if(location == 0) location = queue.size() - 1;
            else location--;
        }
        return answer;
    }
}