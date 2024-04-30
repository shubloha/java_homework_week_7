import java.util.Scanner;

public class Programme7 {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Sales ID");
        int salesID = scanner.nextInt();

        System.out.println("Please enter Seller's name ");
        String sallerName = scanner.next();

        System.out.println("Please enter Sales Amount,");
        double salesAmount = scanner.nextDouble();

        System.out.println("Please enter Basic Salary");
        double basicSalary = scanner.nextDouble();

        //Calculate sales commission

        double commission = s1(salesAmount);

        //Print sales commission
        System.out.println("Sales ID: " + salesID);
        System.out.println("Seller's Name: " + sallerName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Sales Commission: " + commission);

        scanner.close();


    }

    public static double s1(double salesAmount) {
        if (salesAmount >= 50000) {
            return salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            return salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            return salesAmount * 0.05;
        } else {
            return salesAmount * 0.02;
        }

    }
}
