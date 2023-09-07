import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map1.put(want[i], number[i]);
        }
        for(int i = 0; i <= discount.length - 10; i++) {
            boolean isPossible = true;
            HashMap<String, Integer> map2 = new HashMap<>();
            for(int j = i; j < i + 10; j++) {
                map2.put(discount[j], map2.getOrDefault(discount[j], 0) + 1);
            }
            for(int j = 0; j < want.length; j++) {
                if(!map2.containsKey(want[j]) || map1.get(want[j]) > map2.get(want[j])) {
                    isPossible = false;
                    break;
                }
            }
            if(isPossible) answer++;
        }
        return answer;
    }
}