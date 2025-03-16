import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {br.readLine(), br.readLine(), br.readLine()};
        for(int i = 0; i < 3; i++) {
            if(!arr[i].contains("Fizz") && !arr[i].contains("Buzz")) {
                int num = Integer.parseInt(arr[i]) + (3 - i);
                if(num % 3 == 0 && num % 5 == 0) System.out.println("FizzBuzz");
                else if(num % 3 == 0) System.out.println("Fizz");
                else if(num % 5 == 0) System.out.println("Buzz");
                else System.out.println(num);
                break;
            }
        }
    }
}
