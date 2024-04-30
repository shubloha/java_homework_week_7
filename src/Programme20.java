public class Programme20 {

    /**
     *
     *   //Write a Java program to test if an array contains a specific value
     */
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 3, 7, 4, 6};
        int targetValue = 7; // Value to search for

        // Checking if the numeric array contains the target value
        boolean containsValue = containsValue(numericArray, targetValue);

        // Printing the result
        if (containsValue) {
            System.out.println("Numeric array contains the value " + targetValue);
        } else {
            System.out.println("Numeric array does not contain the value " + targetValue);
        }
    }

    // Method to test if an array contains a specific value
    public static boolean containsValue(int[] array, int value) {
        // Iterate through the array to search for the value
        for (int num : array) {
            if (num == value) {
                return true; // Return true if the value is found
            }
        }
        return false; // Return false if the value is not found
    }
}
