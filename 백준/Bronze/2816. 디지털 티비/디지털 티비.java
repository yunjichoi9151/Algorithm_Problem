import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for(int i = 0; i< N; i++) {
            if(arr[i].equals("KBS1")) {
                String tmp = "";
                for(int j = i; j > 0; j--) {
                    sb.append(4);
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                break;
            }
            else 
                sb.append(1);
        }
        
        if(arr[1].equals("KBS2"))
            return;
        
        for (int i = 0; i < N; i++) {
            if (arr[i].equals("KBS2")) {
                String tmp = "";
                for (int j = i; j > 1; j--) {
                    sb.append(4);
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
                break;
            } else
                sb.append(1);
        }
        System.out.println(sb.toString().trim());
    }
}