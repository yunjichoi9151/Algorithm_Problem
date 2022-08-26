import java.util.Scanner;
import java.util.Stack;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int t = sc.nextInt();
            char[] arr = new char[t];
            Stack<Character> stack1 = new Stack<>();
            Stack<Character> stack2 = new Stack<>();
            Stack<Character> stack3 = new Stack<>();
            Stack<Character> stack4 = new Stack<>();
            String s = sc.next();
            int sum = 0, size = 0;
            for(int i = 0; i < t; i++) {
                arr[i] = s.charAt(i);
            }
            for(int i = 0; i < t; i++) {
                if(arr[i] == '(') {
                    stack1.push(arr[i]);
                }
                else if(arr[i] == ')') {
                    if(stack1.size() == 0) {
                        size++;
                        break;
                    }
                    stack1.pop();
                }
                else if(arr[i] == '[') {
                    stack2.push(arr[i]);
                }
                else if(arr[i] == ']') {
                    if(stack2.size() == 0) {
                        size++;
                        break;
                    }
                    stack2.pop();
                }
                else if(arr[i] == '{') {
                    stack3.push(arr[i]);
                }
                else if(arr[i] == '}') {
                    if(stack3.size() == 0) {
                        size++;
                        break;
                    }
                    stack3.pop();
                }
                else if(arr[i] == '<') {
                    stack4.push(arr[i]);
                }
                else if(arr[i] == '>') {
                    if(stack4.size() == 0) {
                        size++;
                        break;
                    }
                    stack4.pop();
                }
            }
            size = stack1.size() + stack2.size() + stack3.size() + stack4.size();
            System.out.println("#" + tc + " " + (size == 0 ? 1 : 0));
        }
    }
}