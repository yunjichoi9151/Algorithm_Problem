import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : tangerine) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        for(int key : keys) {
            answer++;
            if(map.get(key) >= k) {
                break;
            } else {
                k -= map.get(key);
            }
        }
        return answer;
    }
}