import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 10000;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = m; i <= n; i++) {
            int cnt = 0;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    break;
                } else {
                    cnt++;
                }
            }
            if(cnt == i - 2) {
                arr.add(i);
            }
        }
        if(arr.isEmpty()) {
            System.out.println(-1);
        } else {
            for(int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
                if(min > arr.get(i)) {
                    min = arr.get(i);
                }
            }
            System.out.println(sum);
            System.out.println(min);
        }
    }
}