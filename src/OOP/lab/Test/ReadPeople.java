package OOP.lab.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class ReadPeople {
    public static void main(String[] args) {
        try {
            ArrayList<Teacher> teacher = new ArrayList<>();
            ArrayList<Student> student = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("people.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                if (data[0].equals("Student"))
                    student.add(new Student(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4]));
                else
                    teacher.add(new Teacher(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
            }

            // Sort teacher
            teacher.sort(new Comparator<Teacher>() {
                @Override
                public int compare(Teacher o1, Teacher o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
            for (Teacher t: teacher) {
                System.out.println(t.name + " " + t.age + " " + t.getSalary());
            }

            // sort student
            student.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return Double.compare(o1.getCgpa(), o2.getCgpa());
                }
            });
            for (Student s: student) {
                System.out.println(s.name + " " + s.age + " " + s.getCgpa() + " " + s.getStudentID());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
