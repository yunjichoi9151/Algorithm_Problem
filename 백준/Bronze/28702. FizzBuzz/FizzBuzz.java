import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean isDone = false;
        for(int i = 0; i < 3; i++) {
            String S = br.readLine();
            if(!isDone && !S.contains("Fizz") && !S.contains("Buzz")) {
                isDone = true;
                int num = Integer.parseInt(S) + (3 - i);
                if(num % 15 == 0) sb.append("FizzBuzz");
                else if(num % 5 == 0) sb.append("Buzz");
                else if(num % 3 == 0) sb.append("Fizz");
                else sb.append(num);
            }
        }
        System.out.println(sb.toString().trim());
    }
}
