import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int before = 0;
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0) {
                    stack.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    while(!stack.isEmpty() && before == stack.peek()) {
                        stack.pop();
                        answer++;
                    }
                    if(stack.isEmpty()) {
                        before = 0;
                    } else {
                        before = stack.peek();
                    }
                    break;
                }
            }
        }
        return answer;
    }
}