import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0, ans = 0;
        for(int right = 0; right < N; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while(map.size() > 2) {
                int tmp = arr[left++];
                int tmp_cnt = map.get(tmp) - 1;
                if(tmp_cnt == 0) map.remove(tmp);
                else map.put(tmp, tmp_cnt);
            }
            ans = Math.max(ans, right - left + 1);
        }
        System.out.println(ans);
    }
}
