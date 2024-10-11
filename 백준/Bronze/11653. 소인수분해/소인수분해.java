import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        if (N == 1)
            return;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= N; i++) {
            if (N % i == 0)
                list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            while (N % tmp == 0) {
                N /= tmp;
                sb.append(tmp + "\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}