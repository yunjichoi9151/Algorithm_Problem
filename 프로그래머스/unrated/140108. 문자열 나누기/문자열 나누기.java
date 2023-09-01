class Solution {
    public int solution(String s) {
        int answer = 1;
        int start = s.charAt(0);
        int same_cnt = 1;
        int diff_cnt = 0;
        int len = s.length();
        int idx = 1;
        while(idx < len) {
            if(s.charAt(idx) == start) {
                same_cnt++;
            } else {
                diff_cnt++;
            }
            if(same_cnt == diff_cnt) {
                if(idx + 1 < len) {
                    start = s.charAt(idx + 1);
                    same_cnt = diff_cnt = 0;
                    answer++;
                }
            }
            idx++;
        }
        return answer;
    }
}