import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
		int tmp_num = 0;
		int num = 0;

		while (true) {
			if (((tmp_num % 10000) / 10) == 666 && tmp_num % 10 != 6) {
				for (int i = 0; i < 1000; i++) {
					if (cnt == n) {
						System.out.print(tmp_num * 1000 + num);
						return;
					}
					num++;
					cnt++;
				}
				tmp_num++;
			}

			else if (tmp_num % 1000 == 666) {
				num = 0;
				for (int i = 0; i < 1000; i++) {

					if (cnt == n) {
						System.out.print(tmp_num * 1000 + num);
						return;
					}
					cnt++;
					num++;
				}
				tmp_num++;
			}

			else if (tmp_num % 100 == 66) {
				num = 600;
				for (int i = 0; i < 100; i++) {
					if (cnt == n) {
						System.out.print(tmp_num * 1000 + num);
						return;
					}
					cnt++;
					num++;
				}
				tmp_num++;
			}

			else if (tmp_num % 10 == 6) {
				num = 660;
				for (int i = 0; i < 10; i++) {
					if (cnt == n) {
						System.out.print(tmp_num * 1000 + num);
						return;
					}
					num++;
					cnt++;
				}
				tmp_num++;
			} 
			
			else {
				num = 666;
				if (cnt == n) {
					System.out.print(tmp_num * 1000 + num);
					return;
				}
				cnt++;
				tmp_num++;
			}
		}
    }
}