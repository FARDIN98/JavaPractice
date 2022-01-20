
package OOP.theory.collectionsdemo;

import java.util.*;  

public class LinkedListReverse{  
 public static void main(String args[]){  
  
  LinkedList <String> ll=new LinkedList<String>();  
  
           ll.add("Rahim");  
           ll.add("Karim");  
           ll.add("Mitul");
           ll.add("Adnan");
           //Traversing the list of elements in reverse order  
           Iterator i=ll.descendingIterator();  
           while(i.hasNext())  
           {  
               System.out.println(i.next());  
           }             
 }  
}  
