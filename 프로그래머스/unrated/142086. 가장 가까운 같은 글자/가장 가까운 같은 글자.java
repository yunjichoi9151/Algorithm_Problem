import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] check = new int[26];
        Arrays.fill(check, -1);
        for(int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'a';
            if(check[tmp] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - check[tmp];
            }
            check[tmp] = i;
        }
        
        return answer;
    }
}