import java.io.*;

public class Main {
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] str = S.split("-");
        sum += calculate(str[0]);
        for(int i = 1; i < str.length; i++) {
            sum -= calculate(str[i]);
        }
        System.out.println(sum);
    }

    static int calculate(String S) {
        String[] arr = S.split("\\+");
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            tmp += Integer.parseInt(arr[i]);
        }
        return tmp;
    }
}
