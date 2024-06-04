import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(i != 0) arr[i] = arr[i - 1] + num;
            else arr[i] = num;
        }
        int diff = arr[X - 1];
        int max = diff;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(diff, 1);
        for(int i = 0; i < N - X; i++) {
            diff = arr[i + X] - arr[i];
            map.put(diff, map.getOrDefault(diff, 0) + 1);
            if(max < diff) max = diff;
        }
        if(max == 0) System.out.println("SAD");
        else System.out.println(max + "\n" + map.get(max));
    }
}