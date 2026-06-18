public class Ex04 {
    public static void main(String[] args) {
        // 배열 + for => for Each
        String[] arr = {"apple", "banana", "cherry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
