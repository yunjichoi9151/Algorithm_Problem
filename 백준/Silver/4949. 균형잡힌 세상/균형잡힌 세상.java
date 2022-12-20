import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while(true) {
            s = sc.nextLine();
            if(s.equals(".")) {
                break;
            }
            System.out.println(result(s));
        }
    }
    public static String result(String s) {
        Stack<Character> stack = new Stack<>();
        String res = "yes";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.empty() || stack.peek() != '(') {
                    res = "no";
                }
                else {
                    stack.pop();
                }
            }
            else if(c == ']') {
                if(stack.empty() || stack.peek() != '[') {
                    res = "no";
                }
                else {
                    stack.pop();
                }
            }
        }
        if(!stack.empty()) {
            res = "no";
        }
        return res;
    }
}