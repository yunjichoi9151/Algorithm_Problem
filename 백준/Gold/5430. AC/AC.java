import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        outerLoop:
        for(int tc = 0; tc < T; tc++) {
            char[] fuc = br.readLine().toCharArray();
            int N = Integer.parseInt(br.readLine());
            String tmp = br.readLine();
            String[] tmp_arr = tmp.substring(1, tmp.length() - 1).split(",");
            Deque<Integer> que = new ArrayDeque<>();
            for(int i = 0; i < N; i++) {
                que.add(Integer.parseInt(tmp_arr[i]));
            }
            boolean flag = false;
            for(char now : fuc) {
                if(now == 'R') flag = !flag;
                else {
                    if (que.isEmpty()) {
                        sb.append("error\n");
                        continue outerLoop;
                    }
                    if(!flag) que.removeFirst();
                    else que.removeLast();
                }
            }
            sb.append("[");
            if (!que.isEmpty()) {
                if (flag) {
                    while (que.size() > 1) sb.append(que.pollLast()).append(",");
                    sb.append(que.pollLast());
                } else {
                    while (que.size() > 1) sb.append(que.pollFirst()).append(",");
                    sb.append(que.pollFirst());
                }
            }
            sb.append("]\n");
        }
        System.out.println(sb.toString().trim());
    }
}
