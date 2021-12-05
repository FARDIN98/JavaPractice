package OOP.lab.SubClassPoly;

class Animal{
    String color;
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Bird extends Animal{
    String type;
    void eat(){
        System.out.println("Bird is eating");
    }
    void fly(){
        System.out.println("Bird is flying");
    }
}
class Horse extends Animal{
    void eat(){
        System.out.println("Horse is eating");
    }
    void sleep(){
        System.out.println("Horse is sleeping");
    }
}

public class SubclassPoly {
    public static void main(String[] args) {
        Animal b = new Bird();
//        b.eat();
        //we can access fly() method by using reference casting. before casting, we should check first.
        if(b instanceof Bird){
//            Bird b1 = (Bird) b;
            ((Bird)b).fly();
            System.out.println("b1 casted");
        }
//        b1.fly();
        Animal h = new Horse();
        if (h instanceof Bird){
            Bird h2 = (Bird) h;
            System.out.println("B2 casted ");
        }
//        Output: b1 casted
//        h.eat();
//        Horse h1 = (Horse)h; //here we did reference casting. We cast the "h" reference into horse
//        h1.sleep();
    }
}
