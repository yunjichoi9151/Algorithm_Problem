import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            if (arr[i] != arr[N - 1 - i]) {
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }
}