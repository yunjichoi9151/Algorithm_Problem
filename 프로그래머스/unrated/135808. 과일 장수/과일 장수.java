import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int now_idx = score.length - 1;
        while(true) {
            if(now_idx + 1 - m < 0) {
                break;
            }
            answer += score[now_idx - m + 1] * m;
            now_idx -= m;
        }
        return answer;
    }
}