import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int tmp = sc.nextInt() % 42;
            if(!arr.contains(tmp)) {
                arr.add(tmp);
            }
        }
        System.out.println(arr.size());
        sc.close();
    }
}