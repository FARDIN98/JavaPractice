package OOP.theory.Abstraction;

public class Test {
    public static void main(String[] args) {
        Shape sh;
        sh = new Rectangle(10,20);
        sh.PrintArea();
        sh  = new Triangle(56,34);
        sh.PrintArea();
        sh = new Circle(10);
        sh.PrintArea();
    }
}
