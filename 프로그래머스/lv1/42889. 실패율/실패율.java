import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] cnt = new int[N];
        for(int i = 0; i < stages.length; i++) {
            if(stages[i] != N + 1) {
                cnt[stages[i] - 1]++;
            }
        }
        Map<Integer, Double> map = new HashMap<>();
        int num = stages.length;
        for(int i = 0; i < N; i++) {
            if(cnt[i] == 0 || num == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double)cnt[i] / num);
            }
            num -= cnt[i];
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        return answer;
    }
}