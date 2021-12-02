package OOP.theory.Inheritence.practice1;

public class Child extends Parent{
    public int childVariable = 5;
    public void childMethod(){
        parentMethod();
        System.out.println("Parent variable: " + parentVariable
                        + " Child variable: " + childVariable);
    }
}
