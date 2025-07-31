import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean[] ischecked = new boolean[N + 1];
        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        for(int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        que.add(1);
        ischecked[1] = true;
        int cnt = 0;
        while(!que.isEmpty()) {
            int tmp = que.poll();   
            for(int num : list.get(tmp)) {
                if(!ischecked[num]) {
                    que.add(num);
                    ischecked[num] = true;
                    cnt++;
                }                
            }
        }
        System.out.println(cnt);
    }
}
