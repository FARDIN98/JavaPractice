package assignment;

public class Rectangle {
   public double length;
   public double width;
   public double perimeter;
   public double area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }

    public double calculatePerimeter(){
        return (this.length*2) + (this.width*2);
    }
}


