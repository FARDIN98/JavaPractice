
package OOP.theory.collectionsdemo;

import java.util.*;

public class Hashsedemo {
                    public static void main(String[] args){
                    HashSet <String> set = new HashSet<>();
                    // Add to hashset
                    set.add("String 1");
                    set.add("String 2");
                    set.add("String 32");
                    // Print size of hashset
                    System.out.println(set.size()); // prints 3
                    // Duplicate adding not allowed
                    set.add("String 2");
                    System.out.println(set.size()); // prints 3
                    // remove an item from hashset
                    set.remove("String 2");
                    // Check if hashset contains a specific element
                    if(set.contains("String 3"))
                    System.out.println("Found"); // Prints Found
                    else
                    System.out.println("Not Found");
                    }
}
