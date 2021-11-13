//Write a program to calculate CGPA using marks of three subjects (out of 100)
package Java_Basic;

public class CGPA_of_3_numbers_04{
    public static void main(String[] args) {
        double num1 = 45.7;
        double num2 = 60.8;
        double num3 = 57.9;
        double cgpa = (num1 + num2 + num3)/30;
        System.out.println("CGPA of 3 subjects are: " + cgpa);
    }
}
