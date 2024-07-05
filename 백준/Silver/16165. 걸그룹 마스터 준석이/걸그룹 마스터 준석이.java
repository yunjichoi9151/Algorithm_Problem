import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, TreeSet<String>> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String group = br.readLine();
            int n = Integer.parseInt(br.readLine());
            map1.put(group, new TreeSet<>());
            for(int j = 0; j < n; j++) {
                String member = br.readLine();
                map1.get(group).add(member);
                map2.put(member, group);
            }
        }
        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            int t = Integer.parseInt(br.readLine());
            if(t == 0) {
                Iterator<String> iterator = map1.get(s).iterator();
                while(iterator.hasNext()) {
                    sb.append(iterator.next() + "\n");
                }
            } else {
                sb.append(map2.get(s) + "\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}