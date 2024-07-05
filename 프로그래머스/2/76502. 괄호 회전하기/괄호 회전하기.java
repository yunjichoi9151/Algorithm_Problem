import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            String newS = s.substring(i, s.length()) + s.substring(0, i + 1);
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < s.length(); j++) {
                char c = newS.charAt(j);
                if(!stack.isEmpty() && ((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}'))) stack.pop();
                else stack.push(c);
            }
            if(stack.size() == 0) answer++;
        }
        return answer;
    }
}