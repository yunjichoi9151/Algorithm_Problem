import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N / 5;
        while(num >= 0) {
            if((N - num * 5) % 3 == 0) {
                System.out.println(num + ((N - num * 5) / 3));
                return;
            }
            num--;
        }
        System.out.println(-1);
    }
}