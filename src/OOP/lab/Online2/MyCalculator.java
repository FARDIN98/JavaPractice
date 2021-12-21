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


}
