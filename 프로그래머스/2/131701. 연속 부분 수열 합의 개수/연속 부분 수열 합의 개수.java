import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= elements.length; i++) {
            for(int start = 0; start < elements.length; start++) {
                int sum = 0;
                int cnt = 0;
                for(int next = start; next < start + i; next++) {
                    if(cnt >= i) break;
                    if(next >= elements.length) next = 0;
                    sum += elements[next];
                    cnt++;
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}