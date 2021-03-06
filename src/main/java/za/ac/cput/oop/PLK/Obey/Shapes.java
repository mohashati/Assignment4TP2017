package za.ac.cput.oop.PLK.Obey;

/**
 * Created by tmoshasha on 04/27/2017
 */
public abstract class Shapes {

    public double getWidth(Rectangle rectangle) {
        return rectangle.getWidth(rectangle);
    }

    public void setWidth(Rectangle rectangle, double width) {
        rectangle.setWidth(rectangle, width);
    }

    public void setHeight(Rectangle rectangle, double height) {
        rectangle.setHeight(rectangle, height);
    }

    public double getHeight(Rectangle rectangle) {
        return rectangle.getHeight(rectangle);
    }

    public abstract double area(Rectangle rectangle);
}
