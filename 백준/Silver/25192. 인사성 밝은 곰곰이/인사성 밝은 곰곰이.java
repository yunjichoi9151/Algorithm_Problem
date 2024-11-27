import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            if(S.equals("ENTER")) {
                set = new HashSet<>();
            } else if(!set.contains(S)) {
                set.add(S);
                ans++;
            }
        }
        System.out.println(ans);
    }
}