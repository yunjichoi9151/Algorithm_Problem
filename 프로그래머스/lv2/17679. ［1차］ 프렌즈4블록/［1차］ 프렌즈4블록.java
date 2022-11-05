class Solution {
    public int solution(int m, int n, String[] board) {
        int ans = 0;
        char[][] arr = new char[m][n];
        for(int i = 0; i < board.length; i++) {
            arr[i] = board[i].toCharArray();
        }

        while(true) {
            int cnt = count(arr, m, n);
            if(cnt == 0) {
                break;
            }
            ans += cnt;
            drop(arr, m, n);
        }
        return ans;
    }

    public static void isSame(char[][] arr, boolean[][] check, int i, int j) {
        for(int y = i; y < i + 2; y++) {
            for(int x = j; x < j + 2; x++) {
                if(arr[i][j] != arr[y][x]) {
                    return;
                }
            }
        }
        for(int y = i; y < i + 2; y++) {
            for(int x = j; x < j + 2; x++) {
                check[y][x] = true;
            }
        }
    }

    public static int count(char[][] arr, int m, int n) {
        boolean[][] check = new boolean[m][n];
        int cnt = 0;
        for(int i = 0; i < m - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(arr[i][j] != ' ') {
                    isSame(arr, check, i, j);
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(check[i][j]) {
                    arr[i][j] = ' ';
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void drop(char[][] arr, int m, int n) {
        for(int j = 0; j < n; j++) {
            for(int i = m - 1; i >= 0; i--) {
                if(arr[i][j] == ' ') {
                    for(int k = i - 1; k >= 0; k--) {
                        if(arr[k][j] != ' ') {
                            arr[i][j] = arr[k][j];
                            arr[k][j] = ' ';
                            break;
                        }
                    }
                }
            }
        }
    }
}