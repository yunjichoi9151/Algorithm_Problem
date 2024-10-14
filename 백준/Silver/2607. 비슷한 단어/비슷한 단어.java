import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < S.length(); j++) {
                list.add(S.charAt(j));
            }
            String tmp = br.readLine();
            int diff = 0;
            for (int j = 0; j < tmp.length(); j++) {
                if (list.contains(tmp.charAt(j))) {
                    list.remove((Character) tmp.charAt(j));
                } else {
                    diff++;
                }
            }
            if ((diff + list.size() <= 1) || (diff == 1 && list.size() == 1))
                ans++;
        }
        System.out.println(ans);
    }
}