import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int S = 0;
        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;

            switch(str) {
                case "add" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S = S | (1 << num);
                    break;
                case "remove" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S = S & ~(1 << num);
                    break;
                case "check" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    int temp = S & (1 << num);
                    sb.append(((temp == 0) ? 0 : 1) + "\n");
                    break;
                case "toggle" :
                    num = Integer.parseInt(st.nextToken()) - 1 ;
                    S = S ^ (1 << num);
                    break;
                case "all" :
                    S = (1 << 21) - 1;
                    break;
                case "empty" :
                    S = 0;
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}