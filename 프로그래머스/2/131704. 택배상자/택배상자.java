import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int now_idx = 0;
        int n = 1;
        Stack<Integer> stack = new Stack<>();
        while(now_idx < order.length) {
            if(order[now_idx] > n) {
                stack.push(n++);
            } else if(order[now_idx] == n) {
                answer++;
                now_idx++;
                n++;
            } else {
                if(stack.peek() == order[now_idx]) {
                    stack.pop();
                    now_idx++;
                    answer++;
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}