
package OOP.theory.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {  
    //Creating list of Books  
    List<BookDemoClass> list=new LinkedList<BookDemoClass>();  
    //Creating Books  
    BookDemoClass b1=new BookDemoClass(101,"JAVA","Schildt","BPB",8);  
    BookDemoClass b2=new BookDemoClass(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
    BookDemoClass b3=new BookDemoClass(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(BookDemoClass b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}
