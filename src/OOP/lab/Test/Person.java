package OOP.lab.Test;
public abstract class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void typeOfPerson();
}