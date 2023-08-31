import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] cnt = new int[N + 1];
        double user = stages.length;
        for(int num : stages) {
            cnt[num - 1]++;
        }
        Map<Integer, Double> fail = new HashMap<>();
        for(int i = 0; i < N; i++) {
            if(cnt[i] == 0 || user == 0.0) {
                fail.put(i + 1, 0.0);
            } else {
                fail.put(i + 1, cnt[i] / user);
            }
            user -= (double)cnt[i];
        }
        List<Integer> keySet = new ArrayList<>(fail.keySet());
        keySet.sort((o1, o2) -> fail.get(o2).compareTo(fail.get(o1)));
        int idx = 0;
        for(Integer key : keySet) {
            answer[idx++] = key;
        }
        return answer;
    }
}