class Solution {
    public int solution(int n) {
        String s = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        System.out.println(s);
        return Integer.parseInt(s, 3);
    }
}