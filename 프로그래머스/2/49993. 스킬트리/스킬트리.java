import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int now_idx = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < skill_trees.length; i++) {
            boolean isPossible = true;
            stack.push(0);
            now_idx = 0;
            for(int j = 0; j < skill_trees[i].length(); j++) {
                if(!skill.contains("" + skill_trees[i].charAt(j))){
                    continue;
                }
                if(now_idx < skill.length() && skill.charAt(stack.peek()) == skill_trees[i].charAt(j)) {
                    stack.push(++now_idx);
                } else {
                    isPossible = false;
                    break;
                }
            }
            if(isPossible) {
                answer++;
            }
        }
        return answer;
    }
}