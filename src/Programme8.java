import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Programme8 {
    public static String cityName(char alphabet) {
        String city;

        // Determine city name based on the input alphabet
        if (alphabet == 'A'||alphabet == 'a') {
            city = "Ahmadabad";
        } else if (alphabet == 'B'||alphabet == 'b') {
            city = "Bhuj";
        } else if (alphabet == 'C'||alphabet == 'c') {
            city = "Chennai";
        } else if (alphabet == 'D'||alphabet == 'd') {
            city = "Dwarka";
        } else if (alphabet == 'E'||alphabet == 'e') {
            city = "East Dehli";
        } else if (alphabet == 'F'||alphabet == 'f') {
            city = "Fatahpur ";
        } else {
            city = "Invalid entry";
        }

        return city;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet (A-F): ");
        char alphabet = scanner.next().charAt(0);

        String city = cityName(alphabet);

        System.out.println("City Name: " + city);

        scanner.close();
    }

}
