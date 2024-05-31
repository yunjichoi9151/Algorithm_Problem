import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String G = st.nextToken();
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        int answer = set.size();
        if(G.equals("F")) answer /= 2;
        else if(G.equals("O")) answer /= 3;
        System.out.println(answer);
    }
}