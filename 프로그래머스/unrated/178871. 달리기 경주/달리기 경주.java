import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for(String s : callings) {
            int tmp = map.get(s);
            String change = players[tmp - 1];
            players[tmp - 1] = s;
            players[tmp] = change;
            map.put(s, tmp - 1);
            map.put(change, tmp);
        }
        return players;
    }
}