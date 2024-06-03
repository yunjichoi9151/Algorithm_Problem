class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for(int i = 0; i < t.length() - len + 1; i++) {
            if(stol(p) >= stol(t.substring(i, i + len)))
                answer++;
        }
        return answer;
    }
    static long stol(String s) {
        return Long.parseLong(s);
    }
}