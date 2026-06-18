import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        // forEach / 향상된 for문 <- js에서 본 get of와 유사. python의 for문이 이 방식
        char[] charArr = {'a', 'b', 'c'};
        for (int i = 0; i < charArr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("charArr[i] = " + charArr[i]);
            // i는 위의 블록 내 혹은 for()안에 있는 변화식에 영향을 받아야하기 때문에
            // 조작이 가능함.
        }
    }
}
