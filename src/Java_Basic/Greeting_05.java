/*Write a Java program that asks the user to enter his/her name
and greets them with “Hello <name>, have a good day” text. */

package Java_Basic;

import java.util.Scanner;

public class Greeting_05 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day");
    }
}

//Output: Hello Fardin, have a good day
