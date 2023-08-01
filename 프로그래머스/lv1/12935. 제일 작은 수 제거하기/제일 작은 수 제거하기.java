import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        int[] new_arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        Arrays.sort(new_arr);
        int min = new_arr[0];
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        return answer;
    }
}