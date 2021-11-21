package OOP.lab;

public class Book {
    private String name;
    private double price;
    private int availableCopies;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        availableCopies = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
