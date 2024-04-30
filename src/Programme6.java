import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Number");
        int a =scanner.nextInt();
        Programme6 obj =new Programme6();
        obj.s1(a);
      scanner.close();
    }
    public void s1 (int a){
        if(a%2==0){
            System.out.println("Your given number "+a+" is Even");
        }else{
            System.out.println("Your given number "+a+" is Odd");
        }
    }
}
