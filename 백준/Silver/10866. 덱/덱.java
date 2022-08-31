import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
        int k = 0;
        
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			switch (s) {
			case "push_front":
                k = sc.nextInt();
				deque.offerFirst(k);
				break;
            case "push_back":
                k = sc.nextInt();
				deque.offerLast(k);
				break;
			case "pop_front":
                if(deque.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(deque.pollFirst()).append('\n');
                }
				break;
            case "pop_back":
                if(deque.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(deque.pollLast()).append('\n');
                }
				break;
			case "size":
				sb.append(deque.size()).append('\n');
				break;
			case "empty":
				if(deque.isEmpty()) {
                    sb.append(1).append('\n');
                }
                else  {
                    sb.append(0).append('\n');
                }
				break;
			case "front":
                if(deque.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(deque.peekFirst()).append('\n');
                }
                break;
            case "back":
                if(deque.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(deque.peekLast()).append('\n');
                }
                break;
			}
		}
        System.out.println(sb);
	}
}