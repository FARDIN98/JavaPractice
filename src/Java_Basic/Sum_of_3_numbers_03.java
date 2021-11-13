//Write a program to sum three numbers in Java.
package Java_Basic;

import java.util.Scanner;

public class Sum_of_3_numbers_03 {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        b = sc.nextDouble();
        System.out.println("Enter 3rd number: ");
        c = sc.nextDouble();
        double sum = a + b + c;
        System.out.println("Sum of 3 numbers are: " +sum);
    }
}