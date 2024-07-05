import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : tangerine) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> map.get(o2) - map.get(o1));
        for(int n : keySet) {
            k -= map.get(n);
            answer++;
            if(k <= 0) break;
        }
        return answer;
    }
}