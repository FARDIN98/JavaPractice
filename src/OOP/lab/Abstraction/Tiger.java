package OOP.lab.Abstraction;

public class Tiger extends Animal{
    public Tiger(String color, double weight){
        super("Tiger", color, weight);
    }

    @Override
    public void MakeSound(){
        System.out.println("Tiger is roaring");
    }
}
