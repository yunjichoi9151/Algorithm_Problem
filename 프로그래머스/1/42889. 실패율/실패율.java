import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Double> map2 = new HashMap<>();
        for(int i = 0; i < stages.length; i++) {
            map1.put(stages[i], map1.getOrDefault(stages[i], 0) + 1);
        }
        double divide = stages.length;
        for(int i = 1; i <= N; i++) {
            if(map1.containsKey(i)) {
                map2.put(i, (double)(map1.get(i)) / divide);
                divide -= map1.get(i);
            } else {
                map2.put(i, 0.0);
            }
        }
        List<Integer> keySet = new ArrayList<>(map2.keySet());
        Collections.sort(keySet, (o1, o2) -> (map2.get(o2).compareTo(map2.get(o1))));
        for(int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        return answer;
    }
}