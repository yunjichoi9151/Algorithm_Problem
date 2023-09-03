import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : arr) {
            if(c == '(') stack.push('(');
            else {
                if(stack.size() > 0 && stack.peek() == '(') stack.pop();
                else return false;
            }
        }
        return stack.size() == 0 ? true : false;
    }
}