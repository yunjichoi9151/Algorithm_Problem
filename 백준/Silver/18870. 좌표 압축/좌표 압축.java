import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];
        TreeMap<Long, Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            map.put(arr[i], 1);
        }
        int sum = 0;
        for(long num : map.keySet()) {
            sum += 1;
            map.put(num, sum - 1);
        }
        for(int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
