import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "\"재귀함수가 뭔가요?\"";
        String s2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String s3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String s4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
        String s5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
        String s6 = "라고 답변하였지.";
        String s7 = "____";
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        for(int i = 0; i < n; i++) {
            System.out.println(s7.repeat(i) + s1);
            System.out.println(s7.repeat(i) + s2);
            System.out.println(s7.repeat(i) + s3);
            System.out.println(s7.repeat(i) + s4);
        }
        System.out.println(s7.repeat(n) + s1);
        System.out.println(s7.repeat(n) + s5);
        for(int i = n; i >= 0; i--)
        	System.out.println(s7.repeat(i) + s6);
    }    
}