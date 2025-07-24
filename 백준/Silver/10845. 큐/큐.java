import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            if(S.equals("front")) {
                sb.append(que.isEmpty() ? -1 : que.peek()).append("\n");
            } else if(S.equals("back")) {
                sb.append(que.isEmpty() ? -1 : que.peekLast()).append("\n");
            } else if(S.equals("size")) {
                sb.append(que.size()).append("\n");
            } else if(S.equals("empty")) {
                sb.append(que.isEmpty() ? 1 : 0).append("\n");
            } else if(S.equals("pop")) {
                sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");;
            } else {
                que.add(Integer.parseInt(S.split(" ")[1]));
            }
        }
        System.out.println(sb.toString().trim());
    }
}
