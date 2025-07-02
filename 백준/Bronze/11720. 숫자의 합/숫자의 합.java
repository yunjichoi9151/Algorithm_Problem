import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int sum = 0;
        for(char c : arr) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
