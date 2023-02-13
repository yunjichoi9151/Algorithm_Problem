import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[n];
        int j = 0;
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while(queue.size() != 0) {
            for(int i = 1; i < k; i++) {
                queue.add(queue.peek());
                queue.remove();
            }
            if(j < n) {
                arr[j] = queue.peek();
                j++;
                queue.remove();
            }
        }
        System.out.print("<");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
        sc.close();
    }
}