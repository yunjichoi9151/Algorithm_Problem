class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
            } else {
                String s = Long.toString(numbers[i], 2);
                int zero_idx = s.lastIndexOf("0");
                if(zero_idx == -1) {
                    s = "10" + s.substring(1);
                    answer[i] = Long.parseLong(s, 2);
                } else {
                    s = s.substring(0, zero_idx) + "10" + s.substring(zero_idx + 2);
                    answer[i] = Long.parseLong(s, 2);
                }
            }
        }
        return answer;
    }
}