import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			switch(k) {
				case 1:
					stack.push(sc.nextInt());
					break;
				case 2:
					if(!stack.isEmpty()) {
						sb.append(stack.pop());
					} else {
						sb.append(-1);
					}
					break;
				case 3:
					sb.append(stack.size());
					break;
				case 4:
					sb.append(stack.isEmpty() ? 1 : 0);
					break;
				case 5:
					if(!stack.isEmpty()) {
						sb.append(stack.peek());
					} else {
						sb.append(-1);
					}
					break;
			}
			if(k != 1) sb.append("\n");
		}
		System.out.print(sb.toString());
		sc.close();
	}
}