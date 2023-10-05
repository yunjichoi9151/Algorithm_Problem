import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, String> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            String state = sc.next();
            map.put(name, state);
        }
        ArrayList<String> keySet = new ArrayList<>(map.keySet());
        for(int i = keySet.size() - 1; i >= 0; i--) {
            String key = keySet.get(i);
            if(map.get(key).equals("enter")) {
                System.out.println(key);
            }
        }
        sc.close();
    }
}