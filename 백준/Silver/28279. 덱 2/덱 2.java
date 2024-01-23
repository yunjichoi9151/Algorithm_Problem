import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            switch(x) {
                case 1:
                    deq.addFirst(sc.nextInt());
                    break;
                case 2:
                    deq.addLast(sc.nextInt());
                    break;
                case 3:
                    sb.append(!deq.isEmpty() ? deq.pollFirst() : -1);
                    break;
                case 4:
                    sb.append(!deq.isEmpty() ? deq.pollLast() : -1);
                    break;
                case 5:
                    sb.append(deq.size());
                    break;
                case 6:
                    sb.append(deq.isEmpty() ? 1 : 0);
                    break;
                case 7:
                    sb.append(!deq.isEmpty() ? deq.peekFirst() : -1);
                    break;
                case 8:
                    sb.append(!deq.isEmpty() ? deq.peekLast() : -1);
                    break;
            }
            if(x != 1 && x != 2) sb.append('\n');
        }
        System.out.print(sb.toString());
        sc.close();
    }
}