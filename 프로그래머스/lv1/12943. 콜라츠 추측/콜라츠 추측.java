class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long) num;
        if(n == 1) {
            return 0;
        }
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
            if(answer >= 500) {
                return -1;
            }
        }
        return answer;
    }
}