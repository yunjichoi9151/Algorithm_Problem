import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = m; i <= n; i++) {
            int k = i / 2;
            boolean b = false;
            if(i >= 4) {
                for(int j = 2; j <= k; j++) {
                    if(i % j == 0) {
                        break;
                    } else {
                        k = i / j;
                        if(j >= k) {
                            b = true;
                        }
                    }
                }
                if(b == true) {
                    arr.add(i);
                }
            } else {
                if(i == 1) {
                    continue;
                } else {
                    arr.add(i);
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        sc.close();
    }
}