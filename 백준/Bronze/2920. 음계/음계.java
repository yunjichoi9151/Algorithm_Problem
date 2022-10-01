import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
            if(i > 0) {
                if(arr[i] > arr[i - 1]) {
                    tmp1++;
                }
                else if(arr[i] < arr[i - 1]) {
                    tmp2++;
                }
            }
        }
        if(tmp1 == 7) {
            System.out.println("ascending");
        } else if(tmp2 == 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        sc.close();
    }
}