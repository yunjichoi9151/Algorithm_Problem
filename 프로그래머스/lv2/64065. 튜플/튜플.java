import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[{}]", "");
        String[] arr = s.split(",");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int tmp = Integer.parseInt(arr[i]);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        int[] answer = new int[map.size()];
        int idx = 0;
        for(int key : keys) {
            answer[idx++] = key;
        }
        return answer;
    }
}