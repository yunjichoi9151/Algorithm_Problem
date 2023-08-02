class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            int now = i;
            answer++;
            for(int j = 2; j <= i / j; j++) {
                if(i % j == 0 && j != 1) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}