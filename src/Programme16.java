import java.util.Scanner;

public class Programme16 {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * zero
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input from the user

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the entered number

        // Check whether the number is positive, negative, or zero
        String result = s1(number);

        // Print the result
        System.out.println("Number is " + result);

        scanner.close(); // Close the Scanner object to prevent resource leak
    }

    // Method to check if a number is positive, negative, or zero
    public static String s1(int number) {
        // Check if the number is positive, negative, or zero using if-else statements
        if (number > 0) { // If number is greater than 0
            return "POSITIVE"; // Return "POSITIVE"
        } else if (number < 0) { // If number is less than 0
            return "NEGATIVE"; // Return "NEGATIVE"
        } else { // If number is neither positive nor negative (i.e., it is 0)
            return "ZERO"; // Return "ZERO"
        }
    }
}
