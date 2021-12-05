package OOP.theory.Abstraction;

public class Circle extends Shape{
//    "r" stored in dim1 & dim2
    Circle(int r){
        super(r,r);
    }
    @Override
    void PrintArea(){
        double result = 3.1416 * dim1 * dim2;
        System.out.println("Circle area: " + result);
    }}
