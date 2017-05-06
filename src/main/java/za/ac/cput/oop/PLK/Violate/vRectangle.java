package za.ac.cput.oop.PLK.Violate;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class vRectangle extends vShapes {

    private double width;
    private double height;

    public vRectangle() {
    }

    public vRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){

        return height * width;
    }
}
