import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for(int i = 0; i < S.length(); i++) {
            int n = S.charAt(i) - 'a';
            if(arr[n] == -1) arr[n] = i;
        }
        for(int i = 0; i < 26; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
