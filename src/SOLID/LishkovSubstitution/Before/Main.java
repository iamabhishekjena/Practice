package SOLID.LishkovSubstitution.Before;

public class Main {

    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(12);
        rectangle.setWidth(10);
        System.out.println("Area of Rectangle: "+rectangle.getArea());

        Square square = new Square();
        square.setHeight(10);
        System.out.println("Area of Square: "+ square.getArea());
    }
}
