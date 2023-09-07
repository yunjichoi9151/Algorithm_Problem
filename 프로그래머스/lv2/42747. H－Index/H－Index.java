import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        int idx = 0;
        for(int i = 0; i <= citations[len - 1]; i++) {
            if(len - idx >= i && idx <= i) {
                answer = i;
            }
            if(i >= citations[idx]) {
                idx++;
            }
        }
        return answer;
    }
}