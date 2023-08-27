class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += " ";
                cnt = 0;
            } else if(cnt % 2 == 0) {
                answer += (s.charAt(i) + "").toUpperCase();
                cnt++;
            } else {
                answer += (s.charAt(i) + "").toLowerCase();
                cnt++;
            }
        }
        return answer;
    }
}