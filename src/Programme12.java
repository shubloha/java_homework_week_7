import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        char input = scanner.next().charAt(0);

        // Determine the type of input
        String inputType = S1(input);

        // Print the result
        System.out.println("The input value is " + inputType);

        scanner.close();
    }

    public static String S1(char input) {
        // Check if the input is a number
        if (Character.isDigit(input)) {
            return "a number";
        }
        // Check if the input is an alphabet (letter)
        else if (Character.isLetter(input)) {
            return "an alphabet";
        }
        // If the input is neither a number nor an alphabet, it's considered a symbol
        else {
            return "a symbol";
        }
    }
}
