class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            String s = babbling[i];
            if(s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            } else {
                s = s.replace("aya", " ");
                s = s.replace("ye", " ");
                s = s.replace("woo", " ");
                s = s.replace("ma", " ");
                s = s.replace(" ", "");
                if(s.length() == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}