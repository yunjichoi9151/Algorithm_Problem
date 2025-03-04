import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = br.readLine().toCharArray();
        int[] cnt = new int[26];
        for(int i = 0; i < 26; i++) {
            cnt[i] = -1;
        }
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i] - 'a';
            if(cnt[num] == -1) cnt[num] = i;
        }
        for(int i = 0; i < 26; i++) {
            sb.append(cnt[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
