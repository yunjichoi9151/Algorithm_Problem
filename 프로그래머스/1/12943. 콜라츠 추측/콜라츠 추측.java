class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num;
        while(number != 1) {
            if(number % 2 == 0) number /= 2;
            else number = number * 3 + 1;
            if(answer >= 500) {
                answer = -1;
                break;
            }
            answer++;
        }
        return answer;
    }
}