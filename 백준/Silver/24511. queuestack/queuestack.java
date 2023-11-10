import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        String[] tmp1 = br.readLine().split(" ");
        String[] tmp2 = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            if(tmp1[i].equals("0")) q.add(Integer.parseInt(tmp2[i]));
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int in = Integer.parseInt(st.nextToken());
            if(q.size() == 0) {
                sb.append(in + " ");
            } else {
                q.addFirst(in);
                sb.append(q.pollLast() + " ");
            }
        }
        System.out.println(sb.toString());
    }
}