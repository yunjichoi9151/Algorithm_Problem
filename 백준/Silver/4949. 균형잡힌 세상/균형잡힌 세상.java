import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if(s.equals(".")) break;
            int idx = 0;
            Stack<Character> stack = new Stack<>();
            boolean isTrue = true;
            outerLoop:
            while(s.charAt(idx) != '.') {
                char c = s.charAt(idx);
                switch(c) {
                    case '(' :
                    case '[' :
                        stack.push(c);
                        break;
                    case ')' :
                        if(!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                            break;
                        } else {
                            isTrue = false;
                            break outerLoop;
                        }
                    case ']' :
                        if(!stack.isEmpty() && stack.peek() == '[') {
                            stack.pop();
                            break;
                        } else {
                            isTrue = false;
                            break outerLoop;
                        }
                }
                idx++;
            }
            if(stack.isEmpty() && isTrue && idx == s.length() - 1) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}