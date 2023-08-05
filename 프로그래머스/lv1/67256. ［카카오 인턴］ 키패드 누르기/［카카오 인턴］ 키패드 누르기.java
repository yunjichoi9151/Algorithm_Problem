class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
        int[][] now = {{3, 0}, {3, 2}};
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                now[0] = new int[]{numbers[i] / 3, 0};
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                now[1] = new int[]{numbers[i] / 3 - 1, 2};
            } else {
                int x = numbers[i] >= 2 ? numbers[i] / 3 : 3;
                int left_dis = Math.abs(now[0][0] - x) + Math.abs(now[0][1] - 1);
                int right_dis = Math.abs(now[1][0] - x) + Math.abs(now[1][1] - 1);
                if(left_dis == right_dis) {
                    if(hand.equals("left")) {
                        answer += "L";
                        now[0] = new int[]{x, 1};
                    } else {
                        answer += "R";
                        now[1] = new int[]{x, 1};
                    }
                } else if(left_dis < right_dis) {
                    answer += 'L';
                    now[0] = new int[]{x, 1};
                } else {
                    answer += 'R';
                    now[1] = new int[]{x, 1};
                }
            }
        }
        return answer;
    }
}