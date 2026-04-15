public class NumberClassifier {

    // Phương thức có vòng lặp + rẽ nhánh
    public static void classifyNumbers(int[] numbers) {
        for (int n : numbers) { // vòng lặp
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " là so duong chan");
                } else {
                    System.out.println(n + " là so duong le");
                }
            } else if (n < 0) {
                System.out.println(n + " là so am");
            } else {
                System.out.println("So 0");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0};
        classifyNumbers(arr);
    }
}
