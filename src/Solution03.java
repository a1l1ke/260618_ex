import java.util.HashMap;
import java.util.Map;

public class Solution03 {
    public String solution(String[] participant, String[] completion) {
        // System.out.println()
        // Arrays.toString()
        // 1단계 : 참여자 카운트
        Map<String, Integer> map = new HashMap<>();
        // System.out.println("participant " + Arrays.toString(participant));
        for (String p : participant) {
            // map.put(p, 1);
            // map.put(p, map.get("p") + 1); // NullPointerException
            // if (map.containsKey(p)) {
            //     map.put(p, map.get("p") + 1);
            // } else {
            //     map.put(p, 1);
            // }
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        return "";
    }
}
