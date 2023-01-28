import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = 1;
    while(true) {
      double a = sc.nextInt();
      double b = sc.nextInt();
      double c = sc.nextInt();
      if(a == 0 && b == 0 && c == 0) {
        break;
      }
      System.out.println("Triangle #" + tc);
      if(a == -1) {
        if(b < c) {
          System.out.printf("a = %.3f", Math.sqrt(c * c - b * b));
          System.out.println();
        }
        else {
          System.out.println("Impossible.");
        }
      }
      else if(b == -1) {
        if(a < c) {
          System.out.printf("b = %.3f", Math.sqrt(c * c - a * a));
          System.out.println();
        }
        else {
          System.out.println("Impossible.");
        }
      }
      else if(c == -1) {
        System.out.printf("c = %.3f", Math.sqrt(a * a + b * b));
        System.out.println();
      }
      tc++;
      System.out.println();
    }
  }
}