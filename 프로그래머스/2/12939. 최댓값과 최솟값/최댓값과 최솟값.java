import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if(min > n) min = n;
            if(max < n) max = n;
        }
        return min + " " + max;
    }
}