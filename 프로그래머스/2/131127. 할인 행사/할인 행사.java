import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map1.put(want[i], number[i]);
        }
        for(int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> map2 = new HashMap<>();
            for(int j = i; j < i + 10; j++) {
                map2.put(discount[j], map2.getOrDefault(discount[j], 0) + 1);
            }
            boolean isTrue = true;
            for(String key : map1.keySet()) {
                if(map1.get(key) != map2.get(key)) {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) answer++;
        }
        return answer;
    }
}