public class Programme11 {
    /**
     *
     * Write a java program to print the numbers between1 to 100 which can be divided by 3
     * and 5 separately.
     */


        public static void main(String[] args) {
            // Print numbers divisible by 3
            System.out.println("Numbers between 1 to 100 divisible by 3:");
            printNumbersDivisibleBy3();

            // Print numbers divisible by 5
            System.out.println("\n Numbers between 1 to 100 divisible by 5:");
            printNumbersDivisibleBy5();
        }

        // Method to print numbers divisible by 3
        public static void printNumbersDivisibleBy3() {
            int count = 0; // Initialize a counter to keep track of the number of printed numbers
            for (int i = 1; i <= 100; i++) { // Iterate from 1 to 100
                if (i % 3 == 0) { // Check if the number is divisible by 3
                    System.out.printf("%-5d", i); // Print the number with formatting to align in columns
                    count++; // Increment the counter
                    if (count % 10 == 0) { // Check if 10 numbers have been printed (to print 10 numbers per line)
                        System.out.println(); // Print a newline character to start a new line
                    }
                }
            }
        }

        // Method to print numbers divisible by 5
        public static void printNumbersDivisibleBy5() {
            int count = 0; // Initialize a counter to keep track of the number of printed numbers
            for (int i = 1; i <= 100; i++) { // Iterate from 1 to 100
                if (i % 5 == 0) { // Check if the number is divisible by 5
                    System.out.printf("%-5d", i); // Print the number with formatting to align in columns
                    count++; // Increment the counter
                    if (count % 10 == 0) { // Check if 10 numbers have been printed (to print 10 numbers per line)
                        System.out.println(); // Print a newline character to start a new line
                    }
                }
            }
        }
    }


