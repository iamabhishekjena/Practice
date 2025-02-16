package SOLID.LishkovSubstitution.After;

public class Main {

    public static void main(String args[]){
        Shape rectangle = new Rectangle(10,12);
        Shape square = new Square(10);

        System.out.println("Area of Rectangle:"+rectangle.getArea());
        System.out.println("Area of Square:"+square.getArea());
    }
}
