import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (switch statement) if
 * any other alphabet should be invalid entry
 */
public class Programme9 {
    public static String getCityName(char alphabet) {
        String city;

        // Convert the input alphabet to uppercase
        alphabet = Character.toUpperCase(alphabet);

        switch (alphabet) {
            case 'A':
                city = "Ahmadabad";
                break;
            case 'B':
                city = "Bhuj";
                break;
            case 'C':
                city = "Chennai";
                break;
            case 'D':
                city = "Dwarka";
                break;
            case 'E':
                city = "East Dehli";
                break;
            case 'F':
                city = "Fatahpur";
                break;
            default:
                city = "Invalid entry";
                break;
        }

        return city;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (a-f or A-F): ");
        char alphabet = scanner.next().charAt(0);

        String city = getCityName(alphabet);

        System.out.println("City Name: " + city);

        scanner.close();
    }
}
