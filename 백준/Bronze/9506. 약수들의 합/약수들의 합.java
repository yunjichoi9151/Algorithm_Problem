import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != -1) {
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    arr.add(i);
                    sum += i;
                }
            }
            if(sum == n) {
                System.out.print(n + " = ");
                for(int i = 0; i < arr.size(); i++) {
                    System.out.print(arr.get(i) + (i != arr.size() - 1 ? " + " : ""));
                }
            } else {
                System.out.print(n + " is NOT perfect.");
            }
            System.out.println();
            n = sc.nextInt();
        }
        sc.close();
    }
}