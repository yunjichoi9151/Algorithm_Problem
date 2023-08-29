import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[k];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                arr[i] = score[i];
                if(min > arr[i]) {
                    min = arr[i];
                }
                answer[i] = min;
            } else {
                if(i == k) {
                    Arrays.sort(arr);
                }
                if(arr[0] < score[i]) {
                    arr[0] = score[i];
                }
                Arrays.sort(arr);
                answer[i] = arr[0];
            }
        }
        return answer;
    }
}