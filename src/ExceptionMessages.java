public class ExceptionMessages {

    public static void main(String[] args) {
        int result;

        try {
            // Operation that might cause ArithmeticException (e.g., division by zero)
            result = 10 / 0;  // This will throw ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("haha (Caught ArithmeticException)");
        } catch (IllegalArgumentException e) {
            System.out.println("hehe (Caught IllegalArgumentException)"); // Won't be triggered here
        }
    }
}