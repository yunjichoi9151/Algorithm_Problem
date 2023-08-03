import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] min_arr = new int[26];
        Arrays.fill(min_arr, -1);
        for(int i = 0; i < keymap.length; i++) {
            for(int j = 0; j < keymap[i].length(); j++) {
                int num = keymap[i].charAt(j) - 'A';
                min_arr[num] = min_arr[num] == -1 ? j + 1 : Math.min(min_arr[num], j + 1);
            }
        }
        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                int num = targets[i].charAt(j) - 'A';
                if(min_arr[num] == -1) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += min_arr[num];
            }
        }
        return answer;
    }
}