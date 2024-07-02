import java.util.*;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty() || stack.peek() != arr[i]) stack.push(arr[i]);
            else if(stack.peek() == arr[i]) stack.pop();
        }
        return stack.size() == 0 ? 1 : 0;
    }
}