package OOP.theory.Abstraction;

public class Rectangle extends Shape{
    //dim1,dim2
    Rectangle(int dim1, int dim2){
        super(dim1,dim2);
    }
    @Override
    void PrintArea(){
        int result = dim1 * dim2;
        System.out.println("Rectangle area: " + result);
    }
}
