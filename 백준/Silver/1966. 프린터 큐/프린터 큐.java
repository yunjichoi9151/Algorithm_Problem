import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            Queue<int[]> que = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                que.add(new int[]{i, num});
                pq.add(num);
            }
            int cnt = 0;
            while(!que.isEmpty()) {
                int[] now = que.poll();
                if(now[1] == pq.peek()) {
                    pq.poll();
                    cnt++;
                    if(now[0] == M) {
                        sb.append(cnt).append("\n");
                        break;
                    }
                } else {
                    que.add(now);
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
