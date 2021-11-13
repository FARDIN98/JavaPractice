//Write a Java program to detect whether a number entered by the user is an integer or not.

package Java_Basic;

import java.util.Scanner;

public class Detecting_Integer_07 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("This is an integer number");
        }
        else{
            System.out.println("This is not an integer number");
        }
    }
}
