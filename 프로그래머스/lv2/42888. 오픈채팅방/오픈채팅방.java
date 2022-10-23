import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String[]> log = new LinkedList<>();
        int idx = 0;
        for(int i = 0; i < record.length; i++) {
            String[] words = record[i].split(" ");
            if(words[0].equals("Enter")) {
                map.put(words[1], words[2]);
                log.add(words);
            } else if(words[0].equals("Change")) {
                map.put(words[1], words[2]);
            } else if(words[0].equals("Leave")) {
                log.add(words);
            }
        }
        String[] answer = new String[log.size()];
        for(String[] word : log) {
            String name = map.get(word[1]);
            if(word[0].equals("Enter")) {
                answer[idx++] = name + "님이 들어왔습니다.";
            } else if(word[0].equals("Leave")) {
                answer[idx++] = name + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}
