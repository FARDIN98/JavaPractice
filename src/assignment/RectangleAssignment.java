package assignment;

public class RectangleAssignment {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(25.5, 40.5);
        obj.area = obj.calculateArea();
        obj.perimeter = obj.calculatePerimeter();
        System.out.println("The area of the rectangle is: " + obj.area + ". The perimeter of the rectangle is: " + obj. perimeter);
    }
}
