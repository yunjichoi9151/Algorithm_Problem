import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String S = br.readLine();
            if(!list.contains(S)) list.add(S);
        }
        list.sort((a, b) -> {
            if(a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });
        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + "\n");
        }
        System.out.println(sb.toString().trim());
    }
}
