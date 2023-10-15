import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<int[]> list = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(new int[]{tmp[i], num});
            if(tmp[i] == 0) q.add(num);
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
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