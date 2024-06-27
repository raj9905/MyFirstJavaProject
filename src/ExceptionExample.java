public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[2]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Localized Message: " + e.getLocalizedMessage());
            System.out.println("ToString: " + e.toString());
            System.out.print("StackTrace: ");
            e.printStackTrace();
        }
    }
}
