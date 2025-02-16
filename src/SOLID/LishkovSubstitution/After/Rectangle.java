package SOLID.LishkovSubstitution.After;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return width*height;
    }
}
