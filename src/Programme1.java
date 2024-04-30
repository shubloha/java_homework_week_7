import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1 {
    public static void main (String[]args){
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        //  the user to enter a number
        System.out.println("Please Enter a Number");
        int a = scanner.nextInt();
       Programme1 obj = new Programme1();
        obj.s1(a);

        scanner.close();
    }
    public void s1 (int a){
        // Check if the number is odd or even using ternary operator
        String Result = ((a % 2) == 0) ? "even" : "odd";
        // Display the result
        System.out.println("Your Entered number is :" +Result);

    }
}
