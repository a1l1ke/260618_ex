import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // array & for & for-each
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        System.out.println(i1 + " " + i2 + " " + i3);
//        int[] arr1;
//        arr1 = new int[3]; // 선언과 할당이 나눠져 있음
        int[] arr1 = new int[3]; // 배열 초기화;
        // 할당이 되면 더 이상 길이를 바꿀 수 X. (그 할당된 배열은.)
        // 새롭게 다른 아예 새로운 배열을 할당함으로 대체할 순 있음.
        System.out.println("arr1 = " + arr1);
        arr1 = new int[5];
        System.out.println("arr1 = " + arr1); // immutable -> 대체
        int arr2[] = new int[10]; // 이것도 되긴 하는데 권장은 아님
        System.out.println("arr1[0] = " + arr1[0]); // 기본값 0.
        arr1[0] = 10; // 대입, 수정, 호출 -> 인덱스.
        System.out.println("arr1[0] = " + arr1[0]);
    }
}
