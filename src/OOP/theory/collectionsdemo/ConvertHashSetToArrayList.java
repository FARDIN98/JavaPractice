
package OOP.theory.collectionsdemo;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
class ConvertHashSetToArrayList{ 
  public static void main(String[] args) {
     // Create a HashSet
     HashSet<String> hset = new HashSet<String>();
 
     //add elements to HashSet
     hset.add("Rahim");
     hset.add("Karim");
     hset.add("Bipul");
     hset.add("Nipun");
     hset.add("Anonna");
 
     // Displaying HashSet elements
     System.out.println("HashSet contains: "+ hset);
 
     // Creating a List of HashSet elements
     List<String> list = new ArrayList<String>(hset);
 
     // Displaying ArrayList elements
     System.out.println("ArrayList contains: "+ list);
  }
}