import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<String> setA = new HashSet<>();
		TreeSet<String> setB = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			setA.add(sc.next());
		}
		for(int i = 0; i < m; i++) {
			String tmp = sc.next();
			if(setA.contains(tmp)) {
				setB.add(tmp);
			}
		}
		System.out.println(setB.size());
		Iterator<String> iter = setB.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		sc.close();
	}
}