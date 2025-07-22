import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = N / 5; i >= 0; i--) {
            if((N - i * 5) % 3 == 0) {
                System.out.println(i + ((N - i * 5) / 3));
                return;
            }
        }
        System.out.println(-1);
    }
}
