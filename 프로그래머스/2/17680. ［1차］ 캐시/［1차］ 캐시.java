import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if(list.contains(city)) {
                list.remove(city);
                list.add(city);
                answer += 1;
            } else {
                if(list.size() == cacheSize) {
                    list.remove(0);
                }
                list.add(city);
                answer += 5;
            }
        }
        return answer;
    }
}