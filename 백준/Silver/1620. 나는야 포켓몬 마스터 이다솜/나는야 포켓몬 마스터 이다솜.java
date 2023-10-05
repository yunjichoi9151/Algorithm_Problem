import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] arr = new String[n + 1];
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			String s = sc.next();
			arr[i] = s;
			map.put(s, i);
		}
		for(int i = 0; i < m; i++) {
			String s = sc.next();
			if(s.charAt(0) >= '1' && s.charAt(0) <= '9') {
				System.out.println(arr[Integer.parseInt(s)]);
			} else {
				System.out.println(map.get(s));
			}
		}
		sc.close();
	}
}