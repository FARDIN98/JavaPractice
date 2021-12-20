package Java_Basic.Learning_Arrays;

public class Intro_To_Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];  //creates array

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //printing the value of arrays
        System.out.println(array[0]);  //10

        //printing size of array
        int len = array.length;
        System.out.println(len);  //5

        //sum of arrays
         int sum  = array[0] + array[1] + array[2] + array[3] + array[4];
        System.out.println(sum);  //150
    }
}
