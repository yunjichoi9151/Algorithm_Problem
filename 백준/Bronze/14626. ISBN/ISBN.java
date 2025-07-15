import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] isbn = br.readLine().toCharArray();
        int sum = 0;
        boolean isOne = true;
        for(int i = 0; i < 12; i++) {
            if(isbn[i] == '*') isOne = i % 2 == 0;
            else sum += (i % 2 == 0 ? 1 : 3) * (isbn[i] - '0');
        }
        int m = isbn[12] - '0';
        for(int i = 0; i <= 9; i++) {
            if ((sum + i * (isOne ? 1 : 3) + m) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
