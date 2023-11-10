class Solution {
    public int solution(int n, int m, int[] section) {
        int now = section[0];
        int answer = 1;
        for(int i = 1; i < section.length; i++) {
            if(section[i] > now + m - 1) {
                now = section[i];
                answer++;
            }
        }
        return answer;
    }
}