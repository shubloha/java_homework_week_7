import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class Programme5 {
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.1;
    }

    public static double calculateTA(double basicSalary) {
        return basicSalary * 0.08;
    }

    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.09;
    }

    public static double calculatePF(double basicSalary) {
        return basicSalary * 0.2;
    }

    public static double calculateGrossSalary(double basicSalary) {
        double hra = calculateHRA(basicSalary);
        double ta = calculateTA(basicSalary);
        double da = calculateDA(basicSalary);
        double pf = calculatePF(basicSalary);
        return basicSalary + hra + ta + da - pf;
    }

    public static void printSalarySlip(int employeeId, String employeeName, double basicSalary) {
        double hra = calculateHRA(basicSalary);
        double ta = calculateTA(basicSalary);
        double da = calculateDA(basicSalary);
        double pf = calculatePF(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary);

        // Print Salary Slip
        System.out.println("_______________________________");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id   : " + employeeId);
        System.out.println("| Employee Name : " + employeeName);
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary  : " + basicSalary);
        System.out.println("| HRA 10%       : " + hra);
        System.out.println("| TA 8%         : " + ta);
        System.out.println("| DA 9%         : " + da);
        System.out.println("| PF - 20%      : " + pf);
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary  : " + grossSalary);
        System.out.println("|==============================|");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        printSalarySlip(employeeId, employeeName, basicSalary);

        scanner.close();
    }
}
