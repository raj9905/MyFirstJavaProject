import java.util.Scanner;

public class ArrayAccessTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array with some numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to check if input is valid
        boolean validInput = false;

        // Loop until we get a valid input
        while (!validInput) {
            System.out.println("Enter an index between 0 and " + (numbers.length - 1) + ": ");
            try {
                int index = scanner.nextInt(); // Read the user input

                // Try to access the array element at the given index
                System.out.println("The element at index " + index + " is: " + numbers[index]);
                validInput = true; // If successful, set validInput to true to exit the loop
            } catch (ArrayIndexOutOfBoundsException e) {
                // If an invalid index is entered, catch the exception and inform the user
                System.out.println("Invalid index. Please try again. (Caught ArrayIndexOutOfBoundsException )");
            }
        }

        scanner.close(); // Close the scanner resource
    }
}
