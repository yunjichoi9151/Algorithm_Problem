import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S;
        while(!(S = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            char[] arr = S.toCharArray();
            boolean isTrue = true;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == '(' || arr[i] == '[') stack.add(arr[i]);
                else if(arr[i] == ')') {
                    if(stack.isEmpty() || stack.peek() != '(') {
                        isTrue = false;
                        break;
                    }
                    stack.pop();
                }
                else if(arr[i] == ']') {
                    if(stack.isEmpty() || stack.peek() != '[') {
                        isTrue = false;
                        break;
                    }
                    stack.pop();
                }
            }
            sb.append((isTrue && stack.isEmpty()) ? "yes" : "no").append('\n'); 
        }
        System.out.println(sb.toString().trim());
    }
}
