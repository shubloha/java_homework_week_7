import java.util.Scanner;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {
        //Write a Java program to sum values of an array.
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 3, 7, 4, 6};

        // Summing the values of the numeric array
        int sum = sumArrayValues(numericArray);

        // Printing the sum
        System.out.println("Sum of array values: " + sum);
    }

    // Method to sum the values of an array
    public static int sumArrayValues(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

}
