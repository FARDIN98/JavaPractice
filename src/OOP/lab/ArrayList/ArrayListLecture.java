package OOP.lab.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLecture {
    public static void main(String[] args) {
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        myArrList.add(10);
        myArrList.add(7);
        myArrList.add(2);
        System.out.println(myArrList.size()); //output: 3

        Collections.sort(myArrList); //output: 2 7 10
        Collections.reverse(myArrList); //output: 10 7 2

        for (Integer integer : myArrList) {
            System.out.println(integer);
        }
        /*output: 2
                  7
                  10
         */
    }
}
