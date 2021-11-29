package OOP.lab.online_01;


public class Student {
    private String name;
    private String studentID;
    private double cgpa;

    public Student(String name, String studentID, double cgpa) {
        this.name = name;
        this.studentID = studentID;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String studentCategory(){
        String result = null;
        if (cgpa>=3.5)
        {
            result="Excellent";
        }
        else if(cgpa>=3.0)
        {
            result="Good";
        }
        else if(cgpa>=2.0)
        {
            result="Average";
        }
        else if(cgpa<2.0)
        {
            result="Poor";
        }
        return result;
    }



}




