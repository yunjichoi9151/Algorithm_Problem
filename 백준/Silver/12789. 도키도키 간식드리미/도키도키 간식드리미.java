import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int now = 1;
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			stack.push(tmp);
			while(!stack.isEmpty()) {
				if(stack.peek() == now) {
					now++;
					stack.pop();
				} else {
					break;
				}
			}
		}

		System.out.println(stack.isEmpty() ? "Nice" : "Sad");
		sc.close();
	}
}