class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int count = calculate(n);
        while(true) {
            if(calculate(answer) == count) {
                return answer;
            } else {
                answer++;
            }
        }
    }
    
    public int calculate(int n) {
        int cnt = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}