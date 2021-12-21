package OOP.lab.Online2;

import java.util.Scanner;

public class MyCalculator implements Calculator{

    @Override
    public int factorial(int n) {
        int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        MyCalculator calc = new MyCalculator();
        int output= calc.factorial(input);
        System.out.println("Factorial is: " + output);
    }
}
