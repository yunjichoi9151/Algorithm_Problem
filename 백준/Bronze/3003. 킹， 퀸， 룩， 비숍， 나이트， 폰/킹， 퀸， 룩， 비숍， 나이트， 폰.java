import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] numbers = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < 6; i++) {
            sb.append((numbers[i] - Integer.parseInt(st.nextToken())) + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
