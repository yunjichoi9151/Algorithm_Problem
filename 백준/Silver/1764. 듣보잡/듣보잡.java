import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(set.contains(s)) {
                cnt++;
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(String s : list) {
            System.out.println(s);
        }
    }
}