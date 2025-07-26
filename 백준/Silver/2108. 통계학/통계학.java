import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] cnt_arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_cnt = Integer.MIN_VALUE;
        int now_cnt = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine()) + 4000;
            cnt_arr[num]++;
            min = Math.min(num, min);
            max = Math.max(num, max);
            max_cnt = Math.max(cnt_arr[num], max_cnt);
            sum += num - 4000;
        }
        sb.append((int)Math.round((double)sum / N)).append("\n");
        int cnt_sum = 0;
        int mid_num = 0;
        int max_cnt_num = 0;
        for(int i = min; i <= max; i++) {
            if(cnt_arr[i] == 0) continue;
            if(cnt_arr[i] == max_cnt) {
                now_cnt++;
                if(now_cnt <= 2) max_cnt_num = i - 4000;
            }
            if(cnt_sum <= N / 2 && N / 2 < cnt_sum + cnt_arr[i]) {
                mid_num = i - 4000;
            }
            cnt_sum += cnt_arr[i];
        }
        sb.append(mid_num).append("\n");
        sb.append(max_cnt_num).append("\n");
        sb.append(max - min).append("\n");
        System.out.println(sb.toString().trim());
    }
}
