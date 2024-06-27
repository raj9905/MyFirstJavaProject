public class Calculator {

    // Method to perform addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Define two numbers
        double num1 = 81.0;
        double num2 = 9.0;

        // Perform arithmetic operations
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Test division by zero
        try {
            System.out.println("Division by zero test: " + calculator.divide(num1, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
