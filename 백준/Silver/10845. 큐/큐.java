import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
 	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
        int k = 0;
        
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			switch (s) {
			case "push":
                k = sc.nextInt();
				que.offer(k);
				break;
			case "pop":
                if(que.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(que.poll()).append('\n');
                }
				break;
			case "size":
				sb.append(que.size()).append('\n');
				break;
			case "empty":
				if(que.isEmpty()) {
                    sb.append(1).append('\n');
                }
                else  {
                    sb.append(0).append('\n');
                }
				break;
			case "front":
                if(que.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(que.peek()).append('\n');
                }
                break;
            case "back":
                if(que.isEmpty()) {
                    sb.append(-1).append('\n');
                }
                else  {
                    sb.append(k).append('\n');
                }
                break;
			}
		}
        System.out.println(sb);
	}
}