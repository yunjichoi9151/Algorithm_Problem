import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int index = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
        sc.close();
    }
}