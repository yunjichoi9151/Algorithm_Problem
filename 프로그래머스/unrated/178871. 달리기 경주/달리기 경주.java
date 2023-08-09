import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int playerIndex = map.get(calling);
            if (playerIndex > 0) {
                String tmp = players[playerIndex - 1];
                players[playerIndex - 1] = players[playerIndex];
                players[playerIndex] = tmp;
                map.put(players[playerIndex], playerIndex);
                map.put(players[playerIndex - 1], playerIndex - 1);
            }
        }

        return players;
    }
}