import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        sb.append("<");
        for(int i = 1; i <= N; i++) {
            que.add(i);
        }
        while(!que.isEmpty()) {
            for(int i = 0; i < K - 1; i++) {
                int x = que.poll();
                que.add(x);
            }
            sb.append(que.poll() + (!que.isEmpty() ? ", " : ""));
        }
        sb.append('>');
        System.out.println(sb.toString());
        sc.close();
    }
}