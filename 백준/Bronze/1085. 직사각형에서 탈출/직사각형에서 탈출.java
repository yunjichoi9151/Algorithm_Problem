import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        int[] arr = new int[4];
        arr[0] = Math.abs(y - h);
        arr[1] = Math.abs(x - w);
        arr[2] = x;
        arr[3] = y;
        Arrays.sort(arr);
        System.out.println(arr[0]);
        sc.close();
    }
}