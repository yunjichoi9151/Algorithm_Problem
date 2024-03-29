class Solution {
    public int[] solution(int n, String[] words) {
        char c = words[0].charAt(words[0].length() - 1);
        for(int i = 1; i < words.length; i++) {
            if(words[i].length() == 1 || words[i].charAt(0) != c) {
                return new int[]{i % n + 1, i / n + 1};
            } else {
                for(int j = 0; j < i; j++) {
                    if(words[j].equals(words[i])) {
                        return new int[]{i % n + 1, i / n + 1};
                    }
                }
                c = words[i].charAt(words[i].length() - 1);
            }
        }
        return new int[]{0, 0};
    }
}