import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
		int n = 0;
		int top = 1;
		int bot = 1;
		int cnt = 0;
		if (X == 1) {
			System.out.println("1/1");
		} else {
			while(cnt < X){
				n++;
				cnt = n * (n + 1) / 2;
			}
			int num = X - (n - 1) * n / 2;
			if (n % 2 == 0) {
				top = num;
				bot = n - num + 1;
			} else {
				top = n - num + 1;
				bot = num;
			}
			System.out.println(top + "/" + bot);
		}
    }
}