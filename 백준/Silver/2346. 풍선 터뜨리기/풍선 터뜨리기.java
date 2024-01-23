import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<>();
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        boolean isTrue = true;
        for(int i = 1; i <= N; i++) {
            deq.add(i);
            arr[i] = sc.nextInt();
        }
        while(!deq.isEmpty()) {
            int num = isTrue ? deq.pollFirst() : deq.pollLast();
            sb.append(num + (!deq.isEmpty() ? " " : ""));
            if(deq.isEmpty()) break;
            if(arr[num] > 0) {
                for(int i = 1; i < arr[num]; i++) {
                    deq.addLast(deq.pollFirst());
                }
                isTrue = true;
            } else {
                for(int i = 1; i < Math.abs(arr[num]); i++) {
                    deq.addFirst(deq.pollLast());
                }
                isTrue = false;
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}