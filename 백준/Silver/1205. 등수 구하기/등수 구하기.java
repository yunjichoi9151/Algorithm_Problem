import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stoi(st.nextToken());
        int Score = stoi(st.nextToken());
        int P = stoi(st.nextToken());
        int answer = 1;
        if(N != 0) {
            st = new StringTokenizer(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                int num = stoi(st.nextToken());
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            if(N < P) {
                map.put(Score, map.getOrDefault(Score, 0) + 1);
                for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(entry.getKey() > Score) answer += entry.getValue();
                    else if(entry.getKey() == Score) System.out.println(answer);
                }
            }
            else if(P == 0 || (N == P && map.lastKey() >= Score)) {
                System.out.println(-1);
            } else {
                for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if(entry.getKey() > Score) answer += entry.getValue();
                    else {
                        System.out.println(answer);
                        break;
                    }
                }
            }
        } else if(N == 0 && P != 0) System.out.println(1);
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}