import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        int[] is_in = new int[26];
        Arrays.fill(is_in, -1);
        for(int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if(is_in[idx] == -1) {
                is_in[idx] = i;
            } else {
                answer[i] = i - is_in[idx];
                is_in[idx] = i;
            }
        }
        return answer;
    }
}