import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        // list, map, set
//        ArrayList list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        // 제너릭 -> 객체/참조 타입 -> 대문자로 시작하는 것만.
//        ArrayList<int> list2
        ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<참조타입> -> 대문자로 시작하는 형태. int -> Integer, char -> Character
        // 나머지는 원래 호칭과 기본 타입 키워드가 일치하므로 대문자로만 맨앞으로 바꿔주면 된다
        List<String> list3 = new ArrayList<>(); // <> -> 생략 => 변수 타입을 따라가므로 생략
        // 인터페이스명<제너릭타입> 변수명 = new 구현클래스명<(타입생략)>();
        // 1. 메서드 사용
        list.add("Hello");
        list2.add(1); // 값을 추가할 때는 인덱스 X
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
//        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        // IndexOutOfBoundsException
        list.remove(0);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
    }
}
