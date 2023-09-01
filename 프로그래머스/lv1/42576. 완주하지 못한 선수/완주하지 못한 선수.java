import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String player : completion) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for(String player : participant) {
            if(!map.containsKey(player) || map.get(player) == 0) {
                return player;
            } else {
                map.put(player, map.get(player) - 1);
            }
        }
        return answer;
    }
}