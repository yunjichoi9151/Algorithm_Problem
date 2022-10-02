import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            int tmp = (int)arr[i];
            if(tmp < 80) {
                sum += ((int)arr[i] - 65) / 3 + 3;
            } else if(tmp >= 80 && tmp < 84) {
                sum += 8;
            } else if(tmp >= 84 && tmp < 87) {
                sum += 9;
            } else {
                sum += 10;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}