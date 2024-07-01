class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            String s1 = s.replaceAll("0", "");
            answer[1] += s.length() - s1.length();
            s = Integer.toBinaryString(s1.length());
            answer[0]++;
        }
        return answer;
    }
}