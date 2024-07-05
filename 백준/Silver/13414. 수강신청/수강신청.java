import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0; i < L; i++) {
            String s = br.readLine();
            if(s.contains(s)) set.remove(s);
            set.add(s);
        }
        int size = Math.min(set.size(), K);
        Iterator<String> iterator = set.iterator();
        for(int i = 0; i < size; i++) {
            sb.append(iterator.next() + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}