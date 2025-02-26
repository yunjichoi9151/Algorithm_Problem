import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken()) - 45;
        if(sum < 0) sum = 24 * 60 + sum;
        System.out.println((sum / 60) + " " + (sum % 60));
    }
}