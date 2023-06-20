import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Stack<Integer> stack = new Stack<>();
		boolean isPossible = true;
		int max = 0;
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		outerLoop:
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i - 1] > arr[i]) {
				if(stack.peek() == arr[i]) {
					stack.pop();
					if(max < arr[i - 1]) {
						max = arr[i - 1];
					}
					list.add('-');
				} else {
					isPossible = false;
					break outerLoop;
				}
			} else {
				if(i > 0 && max < arr[i - 1]) {
					max = arr[i - 1];
				}
				int tmp = max + 1;
				for(int j = tmp; j <= arr[i]; j++) {
					stack.push(j);
					list.add('+');
				}
				stack.pop();
				list.add('-');
				
			}
		}
		if(isPossible) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.println("NO");
		}
	}
}