import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int now = 1;
        boolean isPossible = true;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty() && stack.peek() == now) {
                now++;
                stack.pop();
            }
            if(num == now) {
                now++;
            } else {
                stack.push(num);
            }
        }
        int size = stack.size();
        for(int i = 0; i < size; i++) {
            if(stack.peek() == now) {
                now++;
                stack.pop();
            } else {
                isPossible = false;
                break;
            }
        }
        System.out.println(stack.isEmpty() && isPossible ? "Nice" : "Sad");
    }
}