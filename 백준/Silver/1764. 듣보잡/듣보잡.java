import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for(int i = 0; i < M; i++) {
            String S = br.readLine();
            if(set.contains(S)) {
                cnt++;
                list.add(S);
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
