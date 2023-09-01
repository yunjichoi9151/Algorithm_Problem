import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int t = 0; t < moves.length; t++) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][moves[t] - 1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[i][moves[t] - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][moves[t] - 1]);
                    }
                    board[i][moves[t] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}