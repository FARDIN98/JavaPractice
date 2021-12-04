package OOP.theory.Abstraction;

public class Test {
    public static void main(String[] args) {
        Shape sh;
        sh = new Rectangle(10,20);
        sh.area();
        sh  = new Triangle(56.78,34.56);
        sh.area();
        sh = new Circle(10);
        sh.area();
    }
}
