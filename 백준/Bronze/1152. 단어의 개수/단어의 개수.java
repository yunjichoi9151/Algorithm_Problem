import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int cnt = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                if(i > 0 && i < arr.length - 1 && arr[i - 1] != ' ' && arr[i + 1] != ' ') {
                    cnt++;
                } else if((i > 0 && arr[i - 1] != ' ') || (i < arr.length - 1 && arr[i + 1] != ' ')) {
                    continue;
                } else {
                    cnt = 0;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}