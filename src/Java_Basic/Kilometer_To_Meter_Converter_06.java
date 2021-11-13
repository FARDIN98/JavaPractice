package Java_Basic;

import java.util.Scanner;

public class Kilometer_To_Meter_Converter_06 {
    public static void main(String[] args) {
        System.out.println("This is a kilometer to meter converter");
        System.out.print("Enter the value of kilometer: ");
        Scanner sc = new Scanner(System.in);
        double kilo = sc.nextDouble();
        double meter = kilo*1000;
        System.out.println(meter +" meter");
    }
}
//Output: if input is 2 then result will be 2000.0 meter