import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = stoi(st.nextToken());
        int X = stoi(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int t = stoi(st.nextToken());
            if(t < X) sb.append(t + " ");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String S) {
        return Integer.parseInt(S);
    }
}