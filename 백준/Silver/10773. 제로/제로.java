import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if(tmp != 0) {
                stack.push(tmp);
            } else {
                stack.pop();
            }
        }
        int size = stack.size();
        for(int i = 0; i < size; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}