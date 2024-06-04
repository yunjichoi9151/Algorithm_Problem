import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = stoi(br.readLine());
        for(int tc = 0; tc < T; tc++) {
            int N = stoi(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] score = new int[N];
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            for(int i = 1; i <= N; i++) {
                int num = stoi(st.nextToken());
                if(map.containsKey(num)) {
                    map.get(num).add(i);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(num, list);
                }
            }
            for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
                if(entry.getValue().size() < 6)
                    for(int i : entry.getValue())
                        score[i - 1] = -1;
            }
            int tmp = 1;
            for(int i = 0; i < N; i++) {
                if(score[i] != -1)
                    score[i] = tmp++;
            }
            int win = 0;
            int min_score = Integer.MAX_VALUE;
            for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
                if(entry.getValue().size() < 6) continue;
                int sum = 0;
                for(int i = 0; i < 4; i++)
                    sum += score[entry.getValue().get(i) - 1];
                if(min_score == sum) {
                    if(score[map.get(win).get(4) - 1] > score[entry.getValue().get(4) - 1])
                        win = entry.getKey();
                } else if(min_score > sum) {
                    win = entry.getKey();
                    min_score = sum;
                }
            }
            sb.append(win + "\n");
        }
        System.out.println(sb.toString().trim());
    }

    static int stoi(String s) {
        return Integer.parseInt(s);
    }
}