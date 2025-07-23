import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                sum -= stack.pop();
            } else {
                sum += n;
                stack.push(n);
            }
        }
        System.out.println(sum);
    }
}
