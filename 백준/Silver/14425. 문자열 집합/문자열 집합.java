import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(sc.next());
		}
		for(int i = 0; i < m; i++) {
			if(set.contains(sc.next())) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}