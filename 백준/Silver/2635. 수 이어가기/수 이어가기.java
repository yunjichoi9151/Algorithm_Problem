import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = n; i >= n / 2; i--) {
            ArrayList<Integer> List = new ArrayList<>();
            List.add(n);
            int x = n;
            int y = i;
            while(true) {
                if(x < 0)
                    break;
                int z = x;
                if(y >= 0) 
                    List.add(y);
                x = y;
                y = z - x;
            }
            if(cnt < List.size()) {
                cnt = List.size();
                res = List;
            }
        }
        System.out.println(cnt);
        for(Integer c : res)   
            System.out.print(c + " ");
        sc.close();
    }

}