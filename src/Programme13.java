import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number between 1 to 7
        System.out.print("Enter a number between 1 to 7: ");
        int dayNumber = scanner.nextInt();

        // Get the day of the week based on the input number
        String day = getDayOfWeek(dayNumber);

        // Print the day of the week
        System.out.println(day);

        scanner.close();
    }

    // Method to determine the day of the week based on the input number
    public static String getDayOfWeek(int dayNumber) {
        // Determine the day of the week based on the input number
        switch (dayNumber) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                return "Week contains 1 to 7 days";
        }
    }
}
