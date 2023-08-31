class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            int num = (int)Math.sqrt(i);
            for(int j = 1; j <= num; j++) {
                if(i % j == 0) {
                    cnt += 2;
                    if(j == i / j) {
                        cnt--;
                    }
                }
            }
            answer += cnt > limit ? power : cnt;
        }
        return answer;
    }
}