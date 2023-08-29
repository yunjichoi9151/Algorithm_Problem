class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            boolean check = true;
            for(int j = 2; j <= i / j; j++) {
                if(i % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check) answer++;
        }
        return answer;
    }
}