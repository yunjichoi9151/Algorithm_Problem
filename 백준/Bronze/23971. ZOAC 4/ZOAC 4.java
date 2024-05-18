import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.valueOf(st.nextToken());
        int W = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        System.out.println(((H - 1) / (N + 1) + 1) * ((W - 1) / (M + 1) + 1));
    }
}