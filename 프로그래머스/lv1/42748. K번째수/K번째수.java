import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int from = commands[i][0];
            int to = commands[i][1];
            int where = commands[i][2];
            int[] new_arr = new int[to - from + 1];
            int idx = 0;
            for(int j = from - 1; j < to; j++) {
                new_arr[idx++] = array[j];
            }
            Arrays.sort(new_arr);
            answer[i] = new_arr[where - 1];
        }
        return answer;
    }
}