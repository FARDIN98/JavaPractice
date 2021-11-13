/*Write a program to calculate the percentage of a given student in the CBSE board exam.
 His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)*/
package Java_Basic;

import java.util.Scanner;

public class CBSE_Board_Percentage_02 {
    public static void main(String[] args) {
        System.out.println("This is board percentage calculator for 5 subjects(out of 100)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of 1st subject: ");
        double a = sc.nextDouble();
        System.out.println("Enter the number of 2nd subject: ");
        double b = sc.nextDouble();
        System.out.println("Enter the number of 3rd subject: ");
        double c = sc.nextDouble();
        System.out.println("Enter the number of 4th subject: ");
        double d = sc.nextDouble();
        System.out.println("Enter the number of 5th subject: ");
        double e = sc.nextDouble();
        double percentage = (a+b+c+d+e * 100)/500;
        System.out.println("Your total number of 5 subjects are: " + percentage);
    }
}
