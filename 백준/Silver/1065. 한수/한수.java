import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(find(sc.nextInt()));
        sc.close();
    }
    public static int find(int num) {
        int cnt = 0;
        if(num < 100) {
            return num;
        } else {
            cnt = 99;
            for(int i = 100; i <= num ;i++) {
                int n1 = i / 100;
                int n2 = (i / 10) % 10;
                int n3 = i % 10;
                if((n1 - n2) == (n2 - n3)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}