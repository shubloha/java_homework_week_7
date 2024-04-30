import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {
    public static double performOperation(double num1, double num2, char operation) {
        double result = 0;

        // Perform arithmetic operation based on the symbol
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return Double.NaN; // Return NaN (Not a Number) for division by zero
            }
        } else {
            System.out.println("Error: Invalid operation symbol.");
            return Double.NaN; // Return NaN for invalid operation
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input mathematical operation symbol
        System.out.print("Enter the operation symbol (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Perform arithmetic operation
        double result = performOperation(num1, num2, operation);

        // Print the result
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
