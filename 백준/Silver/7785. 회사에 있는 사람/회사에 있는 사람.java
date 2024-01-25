import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        TreeSet<String> set = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            if(tmp[1].equals("enter")) set.add(tmp[0]);
            else set.remove(tmp[0]);
        }
        for(String s : set) {
            sb.insert(0, s + "\n");
        }
        System.out.print(sb.toString().trim());
    }
}