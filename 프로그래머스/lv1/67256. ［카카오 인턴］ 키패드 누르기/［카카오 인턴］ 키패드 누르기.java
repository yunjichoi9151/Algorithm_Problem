class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left = {3, 0};
        int[] right = {3, 2};
        for(int n : numbers) {
            switch(n) {
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    left[0] = (n - 1) / 3;
                    left[1] = 0;
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    right[0] = n / 3 - 1;
                    right[1] = 2;
                    break;
                case 0:
                    n = 11;
                case 2:
                case 5:
                case 8:
                    int l = Math.abs(n / 3 - left[0]) + Math.abs(1 - left[1]);
                    int r = Math.abs(n / 3 - right[0]) + Math.abs(1 - right[1]);
                    if(l == r) {
                        if(hand.equals("left")) {
                            answer += "L";
                            left[0] = n / 3;
                            left[1] = 1;
                        } else {
                            answer += "R";
                            right[0] = n / 3;
                            right[1] = 1;
                        }
                    } else {
                        if(l < r) {
                            answer += "L";
                            left[0] = n / 3;
                            left[1] = 1;
                        } else {
                            answer += "R";
                            right[0] = n / 3;
                            right[1] = 1;
                        }
                    }
                    break;
            }
        }
        return answer;
    }
}
