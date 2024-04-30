import java.util.Scanner;

public class Programme2 {
    /**
     *
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */
    //Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Programme2 obj = new Programme2();

        //Input year from the user
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Call instance method to check if it's a leap year

        boolean S1 = Programme2.S1( year);


        //Display the result
        if (S1) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year");
        }
        scanner.close();


    }

    public static boolean S1(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If year is divisible by 100, it must also be divisible by 400 to be a leap year
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;

    }
}