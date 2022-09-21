import java.util.Scanner;

public class Main {
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt();
        int num = (int)Math.pow(2, n);
        find(r, c, num);
        System.out.println(cnt);
        sc.close();
    }

    public static void find(int y, int x, int num) {
        if(num == 1) {
            return;
        }
        if(x >= 0 && x < num / 2) {
            if(y >= 0 && y < num / 2) {
                find(y, x, num / 2);
            }
            else if(y >= num / 2 && y < num) {
                cnt += 2 * ((num * num) / 4);
                find(y - num / 2, x, num / 2);
            }
        }
        else if(x >= num / 2 && x < num) {
            if(y >= 0 && y < num / 2) {
                cnt += (num * num) / 4;
                find(y, x - num / 2, num / 2);
            }
            else if(y >= num / 2 && y < num) {
                cnt += ((num * num) / 4) * 3;
                find(y - num / 2, x - num / 2, num / 2);
            }
        }
    }
}