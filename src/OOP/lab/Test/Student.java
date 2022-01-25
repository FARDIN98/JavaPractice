package OOP.lab.Test;

public class Student extends Person {
    private double cgpa;
    private String studentID;

    public Student(String name, int age, double cgpa, String studentID) {
        super(name, age);
        this.cgpa = cgpa;
        this.studentID = studentID;
    }

    @Override
    void typeOfPerson() {
        System.out.println("Person is student.");
    }


    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}