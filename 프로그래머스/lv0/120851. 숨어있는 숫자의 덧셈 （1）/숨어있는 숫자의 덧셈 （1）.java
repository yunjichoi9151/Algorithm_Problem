class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++) {
            if(arr[i] >= 48 && arr[i] <= 57) {
                answer += arr[i] - '0';
            }
        }
        return answer;
    }
}