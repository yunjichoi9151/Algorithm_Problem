import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.next();
        String[] arr2 = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        for(int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
        sc.close();
    }
}
