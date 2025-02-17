import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int T = stoi(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append((stoi(st.nextToken()) + stoi(st.nextToken())) + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}