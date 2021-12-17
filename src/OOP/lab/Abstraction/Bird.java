package OOP.lab.Abstraction;

public class Bird extends Animal{

    public Bird(String name, String colour, double weight){
        super(name, colour, weight);
    }

    @Override
    public void MakeSound(){
        System.out.println(name + " is chirping");
    }
}
