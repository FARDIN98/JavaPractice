package OOP.lab.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> myStrList = new ArrayList<String>();
        myStrList.add("Hello");
        myStrList.add("World");
        myStrList.add("Java");

        Collections.sort(myStrList);
        myStrList.set(1, "Javascript"); //hello javascript java
        myStrList.remove(2);  //hello javascript


       for (int i = 0; i < myStrList.size(); i++){
           System.out.println(myStrList.get(i));
       }

    }
}
