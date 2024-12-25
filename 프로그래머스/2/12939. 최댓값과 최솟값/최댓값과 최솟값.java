class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String t : arr) {
            int num = Integer.parseInt(t);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return min + " " + max;
    }
}