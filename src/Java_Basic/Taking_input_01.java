package Java_Basic;
import java.util.Scanner;

public class Taking_input_01 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of 2 number is : " + sum);
        /*boolean is used to check validation;
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);*/

        /* if we want print string from user
        String str = sc.nextLine();
        System.out.println(str);
         */


    }
}
