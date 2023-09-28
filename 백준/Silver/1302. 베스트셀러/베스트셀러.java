import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		int max = 0;
		TreeMap<String, Integer> map = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		ArrayList<String> keySet = new ArrayList<>(map.keySet());
		for(String key : keySet) {
			if(map.get(key) > max) {
				ans = key;
				max = map.get(key);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}