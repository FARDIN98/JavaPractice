package OOP.lab.Online2;

public abstract class Animal {
    public String name;
    public int leg;

    public Animal(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public abstract void eat();

    public void walk(){
        System.out.println(name + " Walks with " + leg + " number of legs");
    }


}
