import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.length() >= M) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
            int compareNum = e2.getValue().compareTo(e1.getValue());
            if(compareNum != 0) return compareNum;
            int compareLength = Integer.compare(e2.getKey().length(), e1.getKey().length());
            if(compareLength != 0) return compareLength;
            return e1.getKey().compareTo(e2.getKey());
        });
        for(Map.Entry<String, Integer> entry : list) {
            sb.append(entry.getKey() + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}