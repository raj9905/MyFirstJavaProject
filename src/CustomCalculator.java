import java.util.Scanner;

public class CustomCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                System.out.println("Select operation (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = calculate(num1, num2, operator);
                System.out.println("Result: " + result);
                break; // Exit loop if calculation is successful

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() // Clear the scanner buffer after each iteration
            }
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) throws Exception {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new Exception("Invalid operator. Please use +, -, *, or /.");
        }

        if (num1 > 100000 || num2 > 100000) {
            throw new Exception("Input cannot be greater than 100000.");
        }

        if (operator == '*' && (num1 > 7000 || num2 > 7000)) {
            throw new Exception("Multiplication inputs cannot exceed 7000.");
        }

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new Exception("Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new Exception("Unexpected error. Please try again.");
        }
    }
}
