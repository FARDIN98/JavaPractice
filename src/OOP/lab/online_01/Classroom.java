package OOP.lab.online_01;


import java.util.Scanner;
public class Classroom {
    public static void main(String[] args) {
        Student [] listOfStudents = new Student[10];
        int numberOfStudents = 0;

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();
            if(choice.equals("a")){

                Student newStudent = inputStudent();
                listOfStudents[numberOfStudents] = newStudent;
                numberOfStudents++;
                System.out.println("Student added successfully!!");
            }
            else if(choice.equals("q")){
                System.out.println("Existing Program.....!!!!!");
                break;

            }
            else if((choice.equals("p"))){
                for(int i = 0; i< numberOfStudents; i++){
                    Student st = listOfStudents[i];
                    System.out.println(st.getName());
                    System.out.println(st.getStudentID());
                    System.out.println(st.getCgpa());
                }
            }
            else{
                System.out.println("invalid choice!!");
            }
        }




    }

    public static Student inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        sc.useDelimiter("\n");
        String studentName = sc.next();
        System.out.print("Enter Student ID: ");
        String studentId = sc.next();
        System.out.print("Enter CGPA: ");
        double studentCgpa= sc.nextDouble();
        Student newStudent = new Student(studentName, studentId,studentCgpa);

        return newStudent;
    }


}
