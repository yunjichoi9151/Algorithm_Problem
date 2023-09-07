import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean isPossible = true;
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                } else {
                    if(!stack.isEmpty() && ((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}'))) {
                        stack.pop();
                    } else {
                        isPossible = false;
                        break;
                    }
                }
            }
            if(isPossible && stack.isEmpty()) answer++;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
}