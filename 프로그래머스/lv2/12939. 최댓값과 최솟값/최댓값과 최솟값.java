import java.util.*;

class Solution {
    public String solution(String s) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[] arr = Arrays.stream(s.split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        
        Arrays.sort(arr);
        return arr[0] + " " + arr[arr.length - 1];
    }
}