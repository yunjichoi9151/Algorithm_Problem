import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt();
        int start = 1, cnt = 0;
        int[] arr = new int[n + 1];
        arr[start]++;
        while(arr[start] != m) {
            if(arr[start] % 2 == 1) {
                if(start + l <= n) {
                    start += l;
                }
                else {
                    start = start + l - n;
                }
            }
            else {
                if(start - l >= 1) {
                    start -= l;
                }
                else {
                    start = start - l + n;
                }
            }
            arr[start]++;
            cnt++;
        }
        System.out.println(cnt);
    }
}