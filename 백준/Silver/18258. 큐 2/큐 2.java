import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            switch(s[0]) {
                case "push":
                    last = Integer.parseInt(s[1]);
                    que.add(last);
                    break;
                case "pop":
                    sb.append(que.isEmpty() ? -1 : que.poll());
                    break;
                case "size":
                    sb.append(que.size());
                    break;
                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    sb.append(que.isEmpty() ? -1 : que.peek());
                    break;
                case "back":
                    sb.append(que.isEmpty() ? -1 : last);
                    break;
            }
            if(!s[0].equals("push")) sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}