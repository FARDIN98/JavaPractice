package OOP.lab.Abstraction;

public abstract class Animal {
    public String name;
    public String colour;
    public double weight;


//    Empty Constructor
//    public Animal(){
//        Empty constructor
//    }

    public Animal(){
        name = "Animal";
        colour = "black";
        weight = 0;
    }

    public Animal(String name, String colour, double weight) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }

    public Animal(String name, String colour){
        this.name = name;
        this.colour = colour;
        weight = 0;
    }

    public abstract void MakeSound();
}
