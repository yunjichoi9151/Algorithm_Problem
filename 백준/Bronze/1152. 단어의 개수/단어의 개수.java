import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(s.split(" ")));
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).isEmpty() == false) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
