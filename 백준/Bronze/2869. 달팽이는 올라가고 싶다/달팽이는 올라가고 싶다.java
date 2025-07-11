import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double V = Double.parseDouble(st.nextToken());
        System.out.println((int)Math.ceil((double)(V - A) / (A - B)) + 1);
    }
}
