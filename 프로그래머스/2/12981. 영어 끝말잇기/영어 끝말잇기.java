import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(list.contains(words[i]) || words[i].length() == 1
               || (list.size() > 0 && list.get(list.size() - 1).charAt(list.get(list.size() - 1).length() - 1) != words[i].charAt(0))) {
                return new int[]{i % n + 1, i / n + 1};
            } else {
                list.add(words[i]);
            }
        }
        return new int[]{0, 0};
    }
}