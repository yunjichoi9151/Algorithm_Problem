import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            if(S.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            } else if(S.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if(S.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if(S.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else {
                stack.push(Integer.parseInt(S.split(" ")[1]));
            }
        }
        System.out.println(sb.toString().trim());
    }
}
