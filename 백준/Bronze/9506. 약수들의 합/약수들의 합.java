import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            if (n == -1)
                break;
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                sb.append(n + " = ");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i != list.size() - 1)
                        sb.append(" + ");
                }
                sb.append("\n");
            } else {
                sb.append(n + " is NOT perfect.\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}