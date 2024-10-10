import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        double all = 0;
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String del = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            double score = ret(st.nextToken());
            if (score != -1) {
                all += num;
                sum += num * score;
            }
        }
        System.out.println(sum != 0 ? sum / all : 0);
    }

    static double ret(String S) {
        double n = 0;
        if (S.charAt(0) == 'A')
            n += 4;
        else if (S.charAt(0) == 'B')
            n += 3;
        else if (S.charAt(0) == 'C')
            n += 2;
        else if (S.charAt(0) == 'D')
            n += 1;
        else if(S.charAt(0) == 'F')
            return 0;
        else
            return -1;
        if (S.charAt(1) == '+')
            n += 0.5;
        return n;
    }
}