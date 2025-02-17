import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        if(score >= 90 && score <= 100) System.out.println('A');
        else if(score >= 80 && score <= 89) System.out.println('B');
        else if(score >= 70 && score <= 79) System.out.println('C');
        else if(score >= 60 && score <= 69) System.out.println('D');
        else System.out.println('F');
    }
}