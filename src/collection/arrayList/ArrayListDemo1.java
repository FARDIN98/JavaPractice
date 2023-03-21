package collection.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        System.out.println("ArrayLIst contains: "+number);

//        for(int x : number){
//            System.out.print(" "+x);
//        }
//        System.out.println();
        System.out.println("size = "+number.size());

        //remove elements
        number.remove(2);
        System.out.println(number);
        System.out.println();
    }
}
