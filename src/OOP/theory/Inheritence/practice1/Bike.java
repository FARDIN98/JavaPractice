package OOP.theory.Inheritence.practice1;

public class Bike extends Vehicle{
    Bike(){
        super(); //will invoke parent class constructor
        System.out.println("Bike is created");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
    }
}
