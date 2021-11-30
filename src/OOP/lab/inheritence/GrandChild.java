package OOP.lab.inheritence;

public class GrandChild extends Child{
//    parentVariable exists
//    parentMethod exists
//    childMethod exists
    public GrandChild(){
//        child constructor calls first
        System.out.println("This is the grandchild constructor");

    }

//    @Override
//    public void parentMethod(){
//        System.out.println("Overriding the parent method in gc");
//    }
}
