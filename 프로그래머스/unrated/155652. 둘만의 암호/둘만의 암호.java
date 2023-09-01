class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            int tmp = 0;
            int idx = 0;
            int now = (s.charAt(i) - 'a' + 1) % 26;
            while(tmp < index) {
                boolean isTrue = false;
                for(int j = 0; j < skip.length(); j++) {
                    if(skip.charAt(j) - 'a' == now) {
                        now = (now + 1) % 26;
                        isTrue = true;
                        break;
                    }
                }
                if(!isTrue) {
                    tmp++;
                    now = (now + 1) % 26;
                }
            }
            answer += (char)((now == 0 ? 25 : now - 1) + 'a');
            
        }
        return answer;
    }
}