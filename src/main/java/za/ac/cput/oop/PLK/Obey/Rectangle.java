package za.ac.cput.oop.PLK.Obey;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class Rectangle extends Shapes{

    private double width;
    private double height;


    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth(Rectangle rectangle) {
        return rectangle.width;
    }

    public void setWidth(Rectangle rectangle, double width) {
        rectangle.width = width;
    }

    public void setHeight(Rectangle rectangle, double height) {
        rectangle.height = height;
    }

    public double getHeight(Rectangle rectangle) {
        return rectangle.height;
    }

    public double area(Rectangle rectangle){

        return rectangle.height * rectangle.width;
    }
}
