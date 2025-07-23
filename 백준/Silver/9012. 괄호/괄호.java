import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            char[] arr = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean isTrue = true;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == '(') {
                    stack.push('(');
                }
                else {
                    if(stack.isEmpty() || stack.peek() != '(') {
                        sb.append("NO\n");
                        isTrue = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(isTrue) sb.append(stack.isEmpty() ? "YES" : "NO").append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
