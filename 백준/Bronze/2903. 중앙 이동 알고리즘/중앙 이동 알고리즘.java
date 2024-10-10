import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int)Math.pow(Math.pow(2, Integer.parseInt(br.readLine())) + 1, 2));
    }
}