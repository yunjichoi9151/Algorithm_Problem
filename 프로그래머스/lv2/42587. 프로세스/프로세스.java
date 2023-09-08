import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[priorities.length];
        arr = Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(arr);
        int idx = arr.length - 1;
        for(int n : priorities) {
            queue.add(n);
        }
        while(!queue.isEmpty()) {
            if(queue.peek() == arr[idx]) {
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