import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int before = Integer.parseInt(st.nextToken());
        for(int i = 0; i < 7; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num == before - 1 || num == before + 1) {
                before = num;
            } else {
                System.out.println("mixed");
                return;
            }
        }
        System.out.println(before == 8 ? "ascending" : "descending");
    }
}
