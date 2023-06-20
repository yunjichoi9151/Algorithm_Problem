import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Work> stack = new Stack<>();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			Work work = null;
			int b = sc.nextInt();
			if(b != 0) {
				int a = sc.nextInt();
				int t = sc.nextInt();
				work = new Work(a, t - 1);
				stack.push(work);
			} else {
				if(!stack.isEmpty()) {
					work = stack.peek();
					work.reduce();
				}
			}
			if(!stack.isEmpty() && work.getTime() == 0) {
				sum += stack.pop().getScore();
			}
		}
		System.out.println(sum);
		sc.close();
	}
}

class Work {
	int score;
	int time;

	public Work(int score, int time) {
		this.score = score;
		this.time = time;
	}

	public int getScore() {
		return score;
	}

	public int getTime() {
		return time;
	}

	public void reduce() {
		this.time--;
	}
}