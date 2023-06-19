import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			char[] arr = s.toCharArray();
			Stack<Character> stack = new Stack<>();
			stack.push(arr[0]);
			for(int j = 1; j < arr.length; j++) {
				if(!stack.isEmpty() && stack.peek() == arr[j]) {
					stack.pop();
				} else {
					stack.push(arr[j]);
				}
			}
			if(stack.isEmpty()) {
				ans++;
			} else {
				stack.clear();
			}
		}
		System.out.println(ans);
		sc.close();
	}
}