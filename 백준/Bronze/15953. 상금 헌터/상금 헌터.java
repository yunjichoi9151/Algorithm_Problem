import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] first  = new int[] {500, 300, 300, 200, 200, 200, 50, 50, 50, 50, 30, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
		int[] second = new int[] {512, 256, 256, 128, 128, 128, 128, 64, 64, 64, 64, 64, 64, 64, 64, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
		for(int i = 0; i < t; i++) {
			int money = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > 0 && a <= 21)
				money += first[a - 1];
			if(b > 0 && b <= 31)
				money += second[b - 1];
			System.out.println(money * 10000);
		}
        sc.close();
    }
}