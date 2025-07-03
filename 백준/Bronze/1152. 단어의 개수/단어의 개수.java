import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        System.out.println(S.equals(" ") ? 0 : S.trim().split(" ").length);
    }
}
