class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = section[section.length - 1];
        int num = end - start + 1;
        
        if (num <= m) {
            return 1;
        } else {
            int idx = 0;
            int curr = 0;
            outerLoop:
            while (idx < section.length) {
                curr = section[idx];
                while(section[idx] < curr + m) {
                    idx++;
                    if(idx >= section.length) {
                        break outerLoop;
                    }
                }
                answer++;
            }
        }
        
        return answer;
    }
}