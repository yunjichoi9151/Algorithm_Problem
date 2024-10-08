import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' }, { 'J', 'K', 'L' }, { 'M', 'N', 'O' },
                { 'P', 'Q', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y', 'Z' } };
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.put(arr[i][j], i + 3);
            }
        }
        char[] str = br.readLine().toCharArray();
        int ans = 0;
        for (int i = 0; i < str.length; i++) {
            ans += map.get(str[i]);
        }
        System.out.println(ans);
    }
}