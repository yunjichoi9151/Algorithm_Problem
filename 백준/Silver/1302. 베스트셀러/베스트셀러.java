import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            map.put(S, map.getOrDefault(S, 0) + 1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> {
            int comp = map.get(o2).compareTo(map.get(o1));
            if (comp == 0) {
                return o1.compareTo(o2);
            }
            return comp;
        });
        System.out.println(keySet.get(0));
    }
}