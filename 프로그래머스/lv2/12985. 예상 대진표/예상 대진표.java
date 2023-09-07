class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        while(true) {
            if(a % 2 == 0 && a - b == 1 || b % 2 == 0 && b - a == 1) {
                return answer;
            } else {
                a = cal(a);
                b = cal(b);
                answer++;
            }
        }
    }
    public int cal(int x) {
        if(x % 2 == 0) {
            return x / 2;
        } else {
            return (x + 1) / 2;
        }
    }
}