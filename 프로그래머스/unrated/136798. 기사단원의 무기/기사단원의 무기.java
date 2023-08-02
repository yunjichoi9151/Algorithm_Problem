class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    count += 2;
                    if (j == i / j) {
                        count--;
                    }
                }
            }
            answer += (count > limit) ? power : count;
        }

        return answer;
    }
}