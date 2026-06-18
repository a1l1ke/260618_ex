import java.util.HashMap;
import java.util.Map;

public class Ex07 {
    public static void main(String[] args) {
        // K, V -> 키 타입, 값 타입
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1000);
        map.put("banana", 2000); // key -> value
        System.out.println("map = " + map);
        System.out.println("map.get(\"apple\") = " + map.get("apple"));
//        map.put("banana", 20000);
        map.put("banana", map.get("banana") * 10);
        System.out.println("map = " + map);
    }
}
