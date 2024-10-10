import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int max = -1;
        int[] where = new int[2];
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (max < n) {
                    max = n;
                    where[0] = i;
                    where[1] = j;
                }
            }
        }
        System.out.println(max + "\n" + where[0] + " " + where[1]);
    }
}