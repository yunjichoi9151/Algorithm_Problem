class Solution {
    public int[] solution(int n, String[] words) {
        char before = words[0].charAt(words[0].length() - 1);
        for(int i = 1; i < words.length; i++) {
            if(words[i].length() == 1) {
                return new int[]{i % n + 1, ((i + 1) % n == 0) ? (i + 1) / n : (i + 1) / n + 1};
            }
            char now = words[i].charAt(0);
            if(before != now) {
                return new int[]{i % n + 1, ((i + 1) % n == 0) ? (i + 1) / n : (i + 1) / n + 1};
            }
            for(int j = 0; j < i; j++) {
                if(words[j].equals(words[i])) {
                    return new int[]{i % n + 1, ((i + 1) % n == 0) ? (i + 1) / n : (i + 1) / n + 1};
                }
            }
            before = words[i].charAt(words[i].length() - 1);
        }
        return new int[]{0, 0};
    }
}