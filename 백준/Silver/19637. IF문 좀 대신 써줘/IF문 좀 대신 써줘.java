import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        String title;
        int power;
        public Node(String title, int power) {
            this.title = title;
            this.power = power;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Node> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Node(st.nextToken(), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(list, Comparator.comparingInt(node -> node.power));
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());
            int idx = binarySearch(list, num);
            sb.append(list.get(idx).title).append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    public static int binarySearch(List<Node> list, int num) {
        int left = 0;
        int right = list.size() - 1;
        while(left < right) {
            int mid = (left + right) / 2;
            if(list.get(mid).power >= num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}