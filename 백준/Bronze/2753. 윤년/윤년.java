import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        System.out.println((y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) ? 1 : 0);
    }
}
