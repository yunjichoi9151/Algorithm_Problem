import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String S = br.readLine();
            sb.append(ctos(S.charAt(0)) + ctos(S.charAt(S.length() - 1)) + "\n");
        }
        System.out.println(sb.toString().trim());
    }
    
    static String ctos(char C) {
        return Character.toString(C);
    }
}