class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] arr = cipher.toCharArray();
        for(int i = code - 1; i < cipher.length(); i += code) {
            answer += arr[i];
        }
        return answer;
    }
}