import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int arr[] = new int[3];
        arr[0] = a * 4 + b * 2;
        arr[1] = b * 2 + c * 4;
        arr[2] = a * 2 + c * 2;
        int min = arr[0];
	    if(arr[1] < min)
		    min = arr[1];
	    if(arr[2] < min)
		    min = arr[2];
        System.out.println(min);
    }
}
