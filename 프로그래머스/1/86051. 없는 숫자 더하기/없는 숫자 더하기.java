class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int n : numbers) {
            answer += n;
        }
        return 45 - answer;
    }
}