
package OOP.theory.collectionsdemo;

import java.util.*;

public class ConvertArrayListToHashSet {
    public static void main(String args[]){  
           ArrayList<String> list=new ArrayList<String>();  
           list.add("Nadia");  
           list.add("Rimi");  
           list.add("Karim");  
             
           HashSet<String> set=new HashSet(list);  
           set.add("Sharif"); 
           
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}
