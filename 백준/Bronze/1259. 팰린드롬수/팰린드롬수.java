import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        while(!S.equals("0")) {
            boolean isTrue = true;
            for(int i = 0; i < S.length() / 2; i++) {
                if(S.charAt(i) != S.charAt(S.length() - i - 1)) {
                    sb.append("no\n");
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) sb.append("yes\n");
            S = br.readLine();
        }
        System.out.println(sb.toString().trim());
    }
}
