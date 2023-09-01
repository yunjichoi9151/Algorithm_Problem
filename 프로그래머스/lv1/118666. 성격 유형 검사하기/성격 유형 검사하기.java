import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] arr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : arr) {
            map.put(c, 0);
        }
        for(int i = 0; i < survey.length; i++) {
            if(choices[i] >= 5) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + (choices[i] - 4));
            } else if(choices[i] <= 3) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + (4 - choices[i]));
            }
        }
        answer += map.get('R') >= map.get('T') ? 'R' : 'T';
        answer += map.get('C') >= map.get('F') ? 'C' : 'F';
        answer += map.get('J') >= map.get('M') ? 'J' : 'M';
        answer += map.get('A') >= map.get('N') ? 'A' : 'N';
        return answer;
    }
}