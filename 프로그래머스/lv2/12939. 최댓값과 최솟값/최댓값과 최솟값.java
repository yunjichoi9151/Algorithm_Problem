class Solution {
    public String solution(String s) {
        int[] ans = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            if(n < ans[0]) ans[0] = n;
            if(n > ans[1]) ans[1] = n;
        }
        return ans[0] + " " + ans[1];
    }
}