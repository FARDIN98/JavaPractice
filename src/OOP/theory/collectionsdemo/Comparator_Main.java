
package OOP.theory.collectionsdemo;

import java.util.*;

public class Comparator_Main {
     // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of Student type
        ArrayList<Student_Comparator> ar = new ArrayList<Student_Comparator>();
 
        // Adding entries in above List
        // using add() method
        ar.add(new Student_Comparator(111, "Rahim", "Canada"));
        ar.add(new Student_Comparator(131, "Karim", "America"));
        ar.add(new Student_Comparator(121, "Sohel", "Australia"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Student_comparator_Sortbyroll());
 
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by name
        Collections.sort(ar, new Student_Comparator_Sortbyname());
 
        // Display message on console for better readability
        System.out.println("\nSorted by name");
 
        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
