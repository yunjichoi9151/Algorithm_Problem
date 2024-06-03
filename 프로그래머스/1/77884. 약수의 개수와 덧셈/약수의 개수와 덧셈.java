class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            answer += (double) Math.sqrt(i) % 1 == 0 ? -i : i;
        }
        return answer;
    }
}