class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            int before = s.length();
            s = s.replaceAll("0", "");
            answer[1] += before - s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}