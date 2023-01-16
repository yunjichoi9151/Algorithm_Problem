import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numlist = new ArrayList<>();
        for(int i = 0; i < n; i++)
            numlist.add(sc.nextInt());
        Collections.sort(numlist);
        StringBuilder sb = new StringBuilder();
		for(int i : numlist)
			sb.append(i).append('\n');
		System.out.println(sb);
        sc.close();
    }
}
