//finding sum & average of arrays
package Java_Basic.Learning_Arrays;

import java.util.Scanner;

public class Sum_And_Avg_Of_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers:");
        double[] num = new double[5];
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of arrays: " + sum);
        double avg = sum / num.length;
        System.out.println("Average: " + avg);

        //finding maximum & minimum of a number in array
        double max = num[0];
        double min = num[0];
        for (int i = 1; i < 5; i++) {
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
