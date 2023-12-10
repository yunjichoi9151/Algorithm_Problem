class Solution {
    static int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        cnt(0, 0, arr.length, arr);        
        return answer;
    }
    
    static void cnt(int x, int y, int size, int[][] arr) {
        if(check(x, y, size, arr)) {
            answer[arr[x][y]]++;
            return;
        }
        cnt(x, y, size / 2, arr);
        cnt(x, y + size / 2, size / 2, arr);
        cnt(x + size / 2, y, size / 2, arr);
        cnt(x + size / 2, y + size / 2, size / 2, arr);
    }
    
    static boolean check(int x, int y, int size, int[][] arr) {
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(arr[i][j] != arr[x][y]) return false;
            }
        }
        return true;
    }
}