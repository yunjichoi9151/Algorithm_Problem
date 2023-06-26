import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        boolean isPal = true;
        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i] + "").equals(arr[arr.length - 1 - i] + "")) {
                isPal = false;
                break;
            }
        }
        System.out.println(isPal ? 1 : 0);
        sc.close();
    }
}