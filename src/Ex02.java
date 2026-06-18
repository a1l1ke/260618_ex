public class Ex02 {
    public static void main(String[] args) {
        // for + while
        // fori
//        int i = 0; // scope 문제
        // 정방향 (++)
        for (int i = 1; i <= 9; i++) {
            System.out.println("i = " + i);
        }
        int w = 1;
        while (w <= 9) {
            System.out.println("w = " + w++);
        }

        // 역방향 (--)
//        for (int i = 1; i <= 9; i--) { // 무한 반복
        for (int i = 9; i > 0; i--) { // 무한 반복
            // 종료조건을 못 만나서
            System.out.println("i = " + i);
        }
        w = 9;
        while (w >= 1) {
            System.out.println("w = " + w--);
        }
        // scope.
    }
}
