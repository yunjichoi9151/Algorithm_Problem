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
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for(int i = 0; i < M; i++) {
            String S = br.readLine();
            if(set.contains(S)) {
                ans.add(S);
            }
        }
        Collections.sort(ans);
        sb.append(ans.size()).append("\n");
        for(int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
