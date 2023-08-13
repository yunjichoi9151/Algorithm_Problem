class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for(int i = 1; i <= sum / 2; i++) {
            if(sum % i == 0) {
                if(i * 2 + (sum / i) * 2 - 4 == brown) {
                    answer[0] = i;
                    answer[1] = sum / i;
                }
            }
        }
        return answer;
    }
}