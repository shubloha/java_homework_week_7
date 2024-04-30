import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme19 {

    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 3, 7, 4, 6};

        // Calculating the average value of the numeric array
        double average = calculateAverage(numericArray);

        // Printing the average value
        System.out.println("Average of array elements: " + average);
    }

    // Method to calculate the average value of array elements
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0; // Return 0 if the array is empty to avoid division by zero
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}

