import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int last = -1;
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.length() < 6) {
                switch(s) {
                    case "pop":
                        sb.append(!que.isEmpty() ? que.poll() : -1);
                        break;
                    case "size":
                        sb.append(que.size());
                        break;
                    case "empty":
                        sb.append(que.isEmpty() ? 1 : 0);
                        break;
                    case "front":
                        sb.append(!que.isEmpty() ? que.peek() : -1);
                        break;
                    case "back":
                        sb.append(!que.isEmpty() ? last : -1);
                        break;
                }
                sb.append('\n');
            } else {
                String[] tmp = s.split(" ");
                int num = Integer.parseInt(tmp[1]);
                que.add(num);
                last = num;
            }
        }
        System.out.print(sb.toString());
    }
}