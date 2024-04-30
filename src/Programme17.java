import java.util.Arrays;
import java.util.Scanner;

/**Write a Java program to sort a numeric array and a string array
 *
 */
public class Programme17 {


    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 3, 7, 4, 6};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));

        // Sorting the numeric array
        sortNumericArray(numericArray);

        // Printing the sorted numeric array
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"banana", "apple", "orange", "grape", "kiwi"};
        System.out.println("\nOriginal string array: " + Arrays.toString(stringArray));

        // Sorting the string array
        sortStringArray(stringArray);

        // Printing the sorted string array
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }

    // Method to sort a numeric array
    public static void sortNumericArray(int[] array) {
        Arrays.sort(array); // Using Arrays.sort() method to sort the array
    }

    // Method to sort a string array
    public static void sortStringArray(String[] array) {
        Arrays.sort(array); // Using Arrays.sort() method to sort the array
    }
    }


