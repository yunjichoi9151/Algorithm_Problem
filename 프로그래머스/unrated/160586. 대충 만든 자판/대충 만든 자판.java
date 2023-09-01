class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < keymap.length; k++) {
                    int tmp = keymap[k].indexOf(c);
                    if(tmp != -1 && min > tmp) {
                        min = tmp;
                    }
                }
                if(min == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += min + 1;
                }
            }
        }
        return answer;
    }
}