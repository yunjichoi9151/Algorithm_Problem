class Solution {
    public int[] solution(long n) {
        String s = n + "";
        int[] answer = new int[s.length()];
        int idx = 0;
        while(idx != s.length()) {
            answer[idx++] = Integer.parseInt(s.charAt(s.length() - idx) + "");
        }
        return answer;
    }
}