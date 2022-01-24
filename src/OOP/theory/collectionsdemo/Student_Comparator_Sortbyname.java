
package OOP.theory.collectionsdemo;

import java.util.Comparator;

public class Student_Comparator_Sortbyname implements Comparator<Student_Comparator>  {
    
    // Method
    // Sorting in ascending order of name
    @Override
    public int compare(Student_Comparator a, Student_Comparator b)
    {
        return a.name.compareTo(b.name);
    }
}
