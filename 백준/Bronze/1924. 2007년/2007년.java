import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int[] arr1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] arr2 = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        if(x != 1) {
            for(int i = 0; i <= x - 2; i++) {
                sum += arr1[i];
            }
        }
        System.out.println(arr2[(sum + y - 1) % 7]);
        sc.close();
    }
}