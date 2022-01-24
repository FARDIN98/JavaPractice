
package OOP.theory.collectionsdemo;

import java.util.Comparator;

class Student_comparator_Sortbyroll implements Comparator<Student_Comparator> {
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Student_Comparator a, Student_Comparator b)
    {
 
        return a.rollno - b.rollno;
    }
}
