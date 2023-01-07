import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if((tmp + "").equals("(")) {
                    stack.push(s.charAt(i));
                }
                else if((tmp + "").equals(")")) {
                    if(stack.size() == 0) {
                        stack.push(s.charAt(i));
                        break;
                    }
                    stack.pop();
                }
            }
            System.out.println((stack.size() == 0 ? "YES" : "NO"));
        }
    }
}