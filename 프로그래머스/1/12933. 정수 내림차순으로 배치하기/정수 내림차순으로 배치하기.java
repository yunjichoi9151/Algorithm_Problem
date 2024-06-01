import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = (n + "").toCharArray();
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--) {
            answer += Math.pow(10, i) * Integer.parseInt(arr[i] + "");
        }
        return answer;
    }
}