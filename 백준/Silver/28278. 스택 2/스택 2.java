import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.length() == 1) {
                switch(Integer.parseInt(s)) {
                    case 2:
                        sb.append(!stack.isEmpty() ? stack.pop() : -1);
                        break;
                    case 3:
                        sb.append(stack.size());
                        break;
                    case 4:
                        sb.append(stack.isEmpty() ? 1 : 0);
                        break;
                    case 5:
                        sb.append(!stack.isEmpty() ? stack.peek() : -1);
                        break;
                }
                sb.append('\n');
            } else {
                String[] tmp = s.split(" ");
                stack.push(Integer.parseInt(tmp[1]));
            }
        }
        System.out.print(sb.toString());
    }
}