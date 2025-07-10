import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S;
        while(!((S = br.readLine()).equals("0"))) {
            int len = S.length();
            boolean isTrue = true;
            for(int i = 0; i < len / 2; i++) {
                if(S.charAt(i) != S.charAt(len - 1 - i)) {
                    sb.append("no\n");
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) sb.append("yes\n");
        }
        System.out.println(sb.toString().trim());
    }
}
