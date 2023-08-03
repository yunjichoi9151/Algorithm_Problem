class Solution {
    public int solution(String s) {
        int answer = 0;
        int idx = 1;
        int cnt1 = 0;
        int cnt2 = 0;
        char before = s.charAt(0);
        boolean isClear = false;
        while(idx < s.length()) {
            if(before == s.charAt(idx)) {
                cnt1++;
                isClear = false;
            } else {
                cnt2++;
                if(cnt1 == 0 || cnt1 == cnt2 - 1) {
                    answer++;
                    cnt1 = 0;
                    cnt2 = 0;
                    if(idx + 1 >= s.length()) {
                        continue;
                    }
                    before = s.charAt(idx + 1);
                    idx++;
                    isClear = true;
                } else {
                    isClear = false;
                }
            }
            idx++;
            if(idx >= s.length() - 1) {
                if(cnt1 == 0 && cnt2 == 0) {
                    answer++;
                } else if(!isClear) {
                    answer++;
                }
                break;
            }
        }
        if(s.length() == 1) {
            answer = 1;
        }
        return answer;
    }
}