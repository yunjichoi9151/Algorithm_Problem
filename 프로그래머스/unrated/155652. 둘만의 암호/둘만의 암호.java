class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        boolean[] arr = new boolean[26];
        for(int i = 0; i < skip.length(); i++) {
            arr[skip.charAt(i) - 'a'] = true;
        }
        for(int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            int num = index;
            int start = idx;
            while (num > 0) {
                start = (start + 1) % 26;
                if (!arr[start]) {
                    num--;
                }
            }
            answer += (char)(start + 'a') + "";
        }
        return answer;
    }
}