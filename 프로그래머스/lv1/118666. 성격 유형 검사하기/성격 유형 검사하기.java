import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] names = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 8; i++) {
            map.put(names[i], 0);
        }
        for(int i = 0; i < choices.length; i++) {
            if(choices[i] == 4) {
                continue;
            }
            else {
                if(choices[i] > 4) {
                    map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
                } else {
                    map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
                }
            }
        }
        answer += map.get('R') < map.get('T') ? 'T' : 'R';
        answer += map.get('C') < map.get('F') ? 'F' : 'C';
        answer += map.get('J') < map.get('M') ? 'M' : 'J';
        answer += map.get('A') < map.get('N') ? 'N' : 'A';
        return answer;
    }
}