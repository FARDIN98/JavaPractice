package OOP.lab.filesPractice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class filedemo1 {
    public static void main(String[] args) {
        File fileObj = new File("D:\\code practice\\Java\\Learning folder\\JavaPractice\\src\\OOP\\lab\\filesPractice\\person.txt");
        //creating file
        /*
       try{
           if (fileObj.createNewFile()){
               System.out.println("Files created successfully at: " + fileObj.getAbsolutePath());
           }else{
               System.out.println("Problems creating file");
           }
       }
       catch (Exception ex){
           ex.printStackTrace();
       }*/
        try  {
            PrintWriter out = new PrintWriter(fileObj);
            Student []students = new Student[3];

            students[0] = new Student("Fardin", 131, 3.58);
            students[1] = new Student("Asif", 133, 3.48);
            students[2] = new Student("Shakin", 134, 3.89);

            for (Student s: students) {
                out.println("name: " + s.name + " id: " + s.id + " cgpa: " +s.cgpa);
            }
            out.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
