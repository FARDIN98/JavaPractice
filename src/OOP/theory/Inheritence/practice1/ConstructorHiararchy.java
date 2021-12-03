package OOP.theory.Inheritence.practice1;
//create a superclass
class A extends Object{
//    class A explicitly extends Object. However, parent always class implicitly call Object
    A(){
        System.out.println("Inside A's Constructor");
    }
}
//create a subclass B by extending super class A
class B extends A{
    B(){
//        Here default super() call for A
        System.out.println("Inside B's Constructor");
    }
}
//create a subclass C by extending super class B
class C extends B{
    C(){
//        here default super() keyword call for B & A
        System.out.println("Inside C's Constructor");
    }
}

public class ConstructorHiararchy {
    public static void main(String[] args) {
        C lol = new C();
    }
}
