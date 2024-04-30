import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No : 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________
 */

public class Programme3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter Maths marks: ");
        int maths = scanner.nextInt();
        System.out.println("Enter Science marks: ");
        int science = scanner.nextInt();
        System.out.println("Enter English marks: ");
        int english = scanner.nextInt();
        int total = calTotal(maths, science, english);                          //Storing calTotal method into total variable
        float percentage = calPercentage(maths, science, english);              //Storing calPercentage method into percentage
        String result = calResult(maths, science, english, percentage);         //Storing calResult method into result variable
        String grade = calGrade(maths, science, english);                       //Storing caGrade method into grade variable
        markSheet(studentName, rollNo, maths, science, english, total, percentage, result, grade);      //Calling marksheet method
        scanner.close();
    }

    public static int calTotal(int maths, int science, int english) {               //Calculating total marks
        int total = maths + science + english;
        return total;
    }

    public static float calPercentage(int maths, int science, int english) {        //Calculating percentage
        float percentage = (maths + science + english) / 3;
        return percentage;
    }

    public static String calResult(int maths, int science, int english, float percentage) {     //Deciding result
        if (maths < 35 || science < 35 || english < 35 || percentage < 35) {
            String result = "Fail";
            return result;
        } else {
            String result = "Pass";
            return result;
        }
    }

    public static String calGrade(int maths, int science, int english) {                    //Deciding grade
        if (maths < 35 || science < 35 || english < 35) {
            String grade = "F";
            return grade;
            //Calling calPercentage method to use as condition
        } else if (calPercentage(maths, science, english) >= 80 && calPercentage(maths, science, english) <= 100) {
            String grade = "A+";
            return grade;
        } else if (calPercentage(maths, science, english) < 80 && calPercentage(maths, science, english) >= 60) {
            String grade = "A";
            return grade;
        } else if (calPercentage(maths, science, english) < 60 && calPercentage(maths, science, english) >= 50) {
            String grade = "B";
            return grade;
        } else if (calPercentage(maths, science, english) < 50 && calPercentage(maths, science, english) >= 35) {
            String grade = "C";
            return grade;
        } else {
            String grade = "F";
            return grade;
        }

    }

    //Printing marksheet
    public static void markSheet(String studentName, int rollNo, int maths, int science, int english, int total, float percentage, String result, String grade) {
        if (maths > 100 || science > 100 || english > 100) {
            System.out.println("Please enter marks between 0 to 100.");
        } else {

            System.out.println("________________________________");
            System.out.println("|                               |");
            System.out.println("|           Mark Sheet          |");
            System.out.println("|_______________________________|");
            System.out.println("|    Name          :     " + studentName + " |");
            System.out.println("|    Roll No       :     " + rollNo + "     |");
            System.out.println("|_______________________________|");
            System.out.println("|    Subjects      :     Marks  |");
            System.out.println("|_______________________________|");
            System.out.println("|    Math          :     " + maths + "     |");
            System.out.println("|    Science       :     " + science + "     |");
            System.out.println("|    English       :     " + english + "     |");
            System.out.println("|_______________________________|");
            System.out.println("|    Total         :     " + total + "    |");
            System.out.println("|_______________________________|");
            System.out.println("|    Percentage    :     " + percentage + "   |");
            System.out.println("|    Result        :     " + result + "   |");
            System.out.println("|    Grade         :     " + grade + "      |");
            System.out.println("|_______________________________|");
        }
    }
}
