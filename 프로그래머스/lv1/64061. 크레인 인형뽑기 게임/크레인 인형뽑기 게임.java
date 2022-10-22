import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int idx = 0;
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0) {
                    arr.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    idx++;
                    if(idx - 1 > 0) {
                        if(arr.get(idx - 1) == arr.get(idx - 2)) {
                            arr.remove(idx - 1);
                            arr.remove(idx - 2);
                            idx -= 2;
                            answer += 2;
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return(answer);
    }
}