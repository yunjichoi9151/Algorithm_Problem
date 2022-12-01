import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Integer[] arr = new Integer[s.length()];
        for(int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < s.length(); i++)
            System.out.print(arr[i]);
    }
}