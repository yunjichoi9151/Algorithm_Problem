class Solution {
    public int[] solution(int[] numbers) {
        boolean[] is_include = new boolean[201];
        int cnt = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int tmp = numbers[i] + numbers[j];
                if(!is_include[tmp]) {
                    is_include[tmp] = true;
                    cnt++;
                }
                if(max < tmp) {
                    max = tmp;
                }
                if(min > tmp) {
                    min = tmp;
                }
            }
        }
        int[] answer = new int[cnt];
        int idx = 0;
        for(int i = min; i <= max; i++) {
            if(is_include[i]) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}