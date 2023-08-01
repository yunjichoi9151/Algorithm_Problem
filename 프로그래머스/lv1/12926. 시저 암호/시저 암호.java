class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char tmp = c;
            for(int j = 0; j < n; j++) {
                if(tmp == 'z') {
                    tmp = 'a';
                } else if(tmp == 'Z') {
                    tmp = 'A';
                } else if(tmp == ' ') {
                    tmp = ' ';
                } else {
                    tmp = (char)(tmp + 1);
                }
            }
            answer += tmp;
        }
        return answer;
    }
}