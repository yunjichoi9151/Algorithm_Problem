import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        long[] copy = new long[N];
        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        int idx = 0;
        for(int i = 0; i < N; i++) {
            if(!map.containsKey(copy[i])) {
                map.put(copy[i], idx++);
            }
        }
        for(int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
