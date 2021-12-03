package OOP.theory.Inheritence.practice1;

public class Child extends Parent{
//    public int childVariable = 5;
//    public void childMethod(){
//        parentMethod();
//        System.out.println("Parent variable: " + parentVariable
//                        + " Child variable: " + childVariable);
//        System.out.println("Child variable: " + childVariable);
//    }
    String name;  //this name hides the name in parent

    public Child(String a, String b){
        super.name = a;  //name in A
        name = b; //name in B
    }

    void show(){
        System.out.println("Superclass name: " + super.name + " Subclass name: " + name);
    }

    @Override
    void message(){
        System.out.println("Welcome to the child class");
    }
    void display(){
        message(); //will invoke current class message() method
        super.message(); //will invoke parent class method
    }
}
