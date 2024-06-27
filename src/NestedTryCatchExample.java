public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Trying to access an element in the array...");

            // Outer try block
            try {
                int index = 2;  // This index does not exist in the array
                int number = numbers[index];  // This line will throw ArrayIndexOutOfBoundsException
                System.out.println("Number at index " + index + " is " + number);

                // Inner try block
                try {
                    int result = number / 0;  // This line will throw ArithmeticException
                    System.out.println("Result of division is " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Inner catch: Cannot divide by zero.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Outer catch: Array index is out of bounds.");
            }
        } catch (Exception e) {
            System.out.println("This will catch any other exceptions not handled above.");
        }
    }
}
