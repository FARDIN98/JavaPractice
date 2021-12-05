package OOP.theory.Abstraction;

public class Triangle extends Shape{
//    dim1, dim2
    Triangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    @Override
    void PrintArea(){
        int result = (int) (0.5 * dim1 * dim2);
        System.out.println("Triangle area: " +result);
    }
}
