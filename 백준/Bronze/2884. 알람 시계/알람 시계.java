import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        if(count < 45) count += 24 * 60;
        count -= 45;
        System.out.println((count / 60) + " " + (count % 60));
    }
}
