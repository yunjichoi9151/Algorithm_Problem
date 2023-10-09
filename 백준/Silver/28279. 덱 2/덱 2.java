import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int num = Integer.parseInt(s[0]);
            switch(num) {
                case 1:
                    deque.addFirst(Integer.parseInt(s[1]));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(s[1]));
                    break;
                case 3:
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
                    break;
                case 4:
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast());
                    break;
                case 5:
                    sb.append(deque.size());
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0);
                    break;
                case 7:
                    sb.append(deque.isEmpty() ? -1 : deque.getFirst());
                    break;
                case 8:
                    sb.append(deque.isEmpty() ? -1 : deque.getLast());
                    break;
            }
            if(num != 1 && num != 2) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}