import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		char[] arr = s.toCharArray();
		outerLoop:
		for(int i = 0; i < n; i++) {
			if(arr[i] <= 57) {
				ans++;
			} else {
				switch(arr[i]) {
					case 'L'  : stack1.push(arr[i]);
								break;
					case 'R' :  if(!stack1.isEmpty()) {
									if(stack1.peek() == 'L') {
										stack1.pop();
										ans++;
									}
								} else {
									break outerLoop;			
								}
								break;
					case 'S'  : stack2.push(arr[i]);
								break;
					case 'K' :  if(!stack2.isEmpty()) {
									if(stack2.peek() == 'S') {
										stack2.pop();
										ans++;
									}
								} else {
									break outerLoop;			
								}
								break;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}