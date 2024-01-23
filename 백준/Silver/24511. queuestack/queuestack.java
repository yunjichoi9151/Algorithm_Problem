import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            check[i] = Integer.parseInt(st.nextToken()) == 0;
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(check[i]) deq.addFirst(num);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            deq.addLast(Integer.parseInt(st.nextToken()));
            sb.append(deq.pollFirst() + " ");
        }
        System.out.println(sb.toString());
    }
}