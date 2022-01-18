package OOP.lab.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListPerson {
    public static void main(String[] args) {
        //This arraylist can store person object
        ArrayList<Person> myList = new ArrayList<Person>();
        Person a = new Person("Fardin",22);
        myList.add(a);
        myList.add(new Person("Asif", 27));
        myList.add(new Person("Shakin", 25));

        Collections.sort(myList, new Comparator<Person>(){
                @Override
                public int compare(Person o1, Person o2) {
                    return (int) (o1.age - o2.age);
                }
            }
        );
        /* lambda expression
        Collections.sort(myList, (Person o1, Person o2) -> (int) (o1.age - o2.age));
        */
        //to access age
        for (int i = 0; i < myList.size(); i++){
            String nm = myList.get(i).name;
            double ag = myList.get(i).age;
            System.out.println("Name: " + nm + " Age: " + ag);
            /*
            Name: Fardin Age: 22.0
            Name: Asif Age: 22.0
             */
        }
    }
}
