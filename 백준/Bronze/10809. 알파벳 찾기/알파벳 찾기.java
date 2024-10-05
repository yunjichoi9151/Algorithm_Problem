import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr1 = br.readLine().toCharArray();
        int[] arr2 = new int[26];
        for(int i = 0; i < 26; i++) arr2[i] = -1;
        for (int i = 0; i < arr1.length; i++) {
            int n = arr1[i] - 'a';
            if (arr2[n] == -1)
                arr2[n] = i;
        }
        for (int i = 0; i < 26; i++)
            sb.append(arr2[i] + " ");
        System.out.println(sb.toString().trim());
    }
}