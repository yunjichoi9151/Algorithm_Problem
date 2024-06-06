import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long T = Long.parseLong(st.nextToken());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        Queue<Long> que = new LinkedList<>();
        Stack<Long> stack = new Stack<>();
        for(long num : arr) {
            if(num < T) stack.push(num);
            else que.offer(num);
        }
        while(true) {
            if(K == 0 || stack.isEmpty()) break;
            T += stack.pop();
            while(true) {
                if(!que.isEmpty() && que.peek() < T) stack.push(que.poll());
                else break;
            }
            K--;
        }
        System.out.println(T);
    }
}