import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                sb.append(que.isEmpty() ? 0 : que.poll()).append("\n");
            } else {
                que.add(num);
            }
        }
        System.out.println(sb.toString().trim());
    }
}
