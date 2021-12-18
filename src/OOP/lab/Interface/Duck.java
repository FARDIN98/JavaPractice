
package OOP.lab.Interface;


public class Duck implements Flyable, Walkable {

    @Override
    public void fly() {
        System.out.println("Duck is flying in " + media);
    }

    @Override
    public boolean needFuel() {
        return false;
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking in " + walkMedia);
    }
    
}
