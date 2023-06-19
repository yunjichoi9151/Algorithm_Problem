import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		int ans = 1;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		stack.push(arr[n - 1]);
		for(int i = n - 2; i >= 0; i--) {
			if(arr[i] > stack.peek()) {
				stack.push(arr[i]);
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}