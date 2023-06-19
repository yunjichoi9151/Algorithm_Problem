import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tmp = sc.nextLine();
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ");
			System.out.print("Case #" + (i + 1) + ": ");
			for(int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j]);
				if(j != 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}