import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> isParking = new HashMap<String, Integer>();
        HashMap<String, String> cars = new HashMap<String, String>();
        for(int i = 0; i < records.length; i++) {
            String[] tmp = records[i].split(" ");
            if(tmp[2].equals("IN")) {
                cars.put(tmp[1], tmp[0]);
            } else if(tmp[2].equals("OUT")) {
                String[] inTime = cars.get(tmp[1]).split(":");
                cars.remove(tmp[1]);
                String[] outTime = tmp[0].split(":");
                int time = 0;
                time += ((Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0])) * 60) + (Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]));
                if(isParking.containsKey(tmp[1])) {
                    isParking.replace(tmp[1], isParking.get(tmp[1]) + time);
                } else {
                    isParking.put(tmp[1], time);
                }
            }
        }
        for(String key : cars.keySet()) {
            String[] inTime = cars.get(key).split(":");
            int time = 0;
            time += ((23 - Integer.parseInt(inTime[0])) * 60) + (59 - Integer.parseInt(inTime[1]));
            if(isParking.containsKey(key)) {
                isParking.replace(key, isParking.get(key) + time);
            } else {
                isParking.put(key, time);
            }
        }
        Object[] sorting = isParking.keySet().toArray();
        Arrays.sort(sorting);
        int[] answer = new int[sorting.length];
        for(int i = 0; i < sorting.length; i++) {
            int finalTime = isParking.get(sorting[i]);
            int fee = 0;
            if(finalTime >= fees[0]) {
                finalTime -= fees[0];
                fee = fees[1];
            } else {
                finalTime = 0;
                fee = fees[1];
            }
            if(finalTime > 0) {
                if(finalTime % fees[2] == 0) {
                    fee += finalTime / fees[2] * fees[3];
                } else {
                    fee += (finalTime / fees[2] + 1) * fees[3];
                }
            }
            answer[i] = fee;
        }
        return answer;
    }
}