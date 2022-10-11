import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int age = sc.nextInt();
        int weight = sc.nextInt();
        while(!(s.equals("#") && age == 0 && weight == 0)) {
            System.out.println(s + " " + ((age > 17 || weight >= 80) ? "Senior" : "Junior"));
            s = sc.next();
            age = sc.nextInt();
            weight = sc.nextInt();
        }
        sc.close();
    }
}