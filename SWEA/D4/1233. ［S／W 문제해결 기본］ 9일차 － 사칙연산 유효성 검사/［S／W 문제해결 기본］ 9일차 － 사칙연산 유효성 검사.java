import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            boolean isPossible = true;
            for(int i = 0; i < n; i++) {
                String[] s = br.readLine().split(" ");
                if(!Character.isDigit(s[1].charAt(0)) && s.length == 2) {
                    isPossible = false;
                } else {
                    continue;
                }
            }
            sb.append("#" + tc + " " + (isPossible ? 1 : 0) + "\n");
        }
        System.out.println(sb);
    }
}