class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String tmp : arr) {
            int num = Integer.parseInt(tmp);
            if(max < num) max = num;
            if(min > num) min = num;
        }
        return min + " " + max;
    }
}