import java.util.Scanner;
import java.util.Stack;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                sb.append(c);
            }
            else if((c + "").equals("(")) {
                stack.push(c);
            }
            else if((c + "").equals(")")) {
                while(!stack.isEmpty()) {
                    if((stack.peek() + "").equals("(")) {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            }
            else {
                while(!stack.isEmpty() && rank(stack.peek()) >= rank(c)) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
        sc.close();
    }
    static int rank(char c) {
        if((c + "").equals("(")) {
            return 0;
        }
        else if((c + "").equals("+") || (c + "").equals("-")) {
            return 1;
        }
        else {
            return 2;
        }
    }
}