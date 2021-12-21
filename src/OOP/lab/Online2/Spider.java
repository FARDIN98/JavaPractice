package OOP.lab.Online2;

public class Spider extends Animal{
    public Spider(String name, int leg) {
        super(name, leg);
    }

    @Override
    public void eat(){
        System.out.println("Spider eats insects");
    }

    public static void main(String[] args) {
        Animal spider  = new Spider("Spider", 8);
        spider.walk();
        spider.eat();
    }
}
