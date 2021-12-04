package OOP.theory.Abstraction;

public class Circle extends Shape{
//    "r" stored in dim1 & dim2
    Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area: " + result);
    }}
