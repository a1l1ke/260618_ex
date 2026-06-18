public class Ex04 {
    public static void main(String[] args) {
        // 배열 + for => for Each
        String[] arr = {"apple", "banana", "cherry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int idx = arr.length - 1 - i;
//            System.out.println("i = " + (arr.length - 1 - i));
//            System.out.println("arr[" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
            System.out.println("idx = " + idx);
            System.out.println("arr[idx] = " + arr[idx]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("i = " + i);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
