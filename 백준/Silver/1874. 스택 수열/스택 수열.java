import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int idx = 0;
        int num = 1;
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        while(idx < N && cnt <= N * 2) {
            if(!stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                sb.append('-').append('\n');
                idx++;
            } else {
                stack.push(num++);
                sb.append('+').append('\n');
            }
            cnt++;
        }
        System.out.println(idx == N ? sb.toString().trim() : "NO");
    }
}
