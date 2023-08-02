import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Integer[] honor = new Integer[k];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            if(i >= score.length) {
                return answer;
            }
            honor[i] = score[i];
            if(min > honor[i]) {
                min = honor[i];
            }
            answer[i] = min;
        }
        Arrays.sort(honor, Comparator.reverseOrder());
        for(int i = k; i < score.length; i++) {
            if(score[i] > honor[k - 1]) {
                honor[k - 1] = score[i];
            }
            Arrays.sort(honor, Comparator.reverseOrder());
            answer[i] = honor[k - 1];
        }
        return answer;
    }
}