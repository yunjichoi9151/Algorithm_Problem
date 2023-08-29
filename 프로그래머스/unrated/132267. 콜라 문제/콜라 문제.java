class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            int tmp = n / a * b;
            n = n % a + tmp;
            answer += tmp;
        }
        return answer;
    }
}