import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int n : d) {
            if(n <= budget) {
                answer++;
                budget -= n;
            }
        }
        return answer;
    }
}