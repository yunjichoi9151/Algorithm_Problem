class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String s = "";
        int num = 0;
        while(s.length() < t * m) {
            s += Integer.toString(num++, n);
        }
        s = s.toUpperCase();
        int idx = p - 1;
        while(answer.length() < t) {
            answer += s.charAt(idx);
            idx += m;
        }
        return answer;
    }
}