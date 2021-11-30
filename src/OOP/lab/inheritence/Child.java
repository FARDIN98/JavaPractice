package OOP.lab.inheritence;

public class Child extends Parent {
//    parentVariable exists here
//    parentMethod exists here
    public Child(){
        System.out.println("This is the child constructor");
    }

    public void childMethod(){
        System.out.println("Accessing parentVariable from child class: " + parentVariable);
        System.out.println("Calling Parent Method from child class: ");
        parentMethod();
    }

    @Override
    public void parentMethod(){
        System.out.println("Overridng the parent method inside child class");
    }

}
