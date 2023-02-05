import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n != 1) {
            ArrayList<Integer> arr = new ArrayList<>();
            int num = 2;
            while(n > 1) {
                if(n % num == 0) {
                    n /= num;
                    arr.add(num);
                } else {
                    num++;
                }
            }
            for(int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }
        sc.close();
    }
}