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
        String[] arr = new String[N + 1];
        for(int i = 1; i <= N; i++) {
            String S = br.readLine();
            arr[i] = S;
            map.put(S, i);
        }
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            if(Character.isDigit(str.charAt(0))) sb.append(arr[Integer.parseInt(str)]).append("\n");
            else sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
