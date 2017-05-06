package za.ac.cput.oop.SRP.Violate;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class vSquare extends vRectangle{

    private double length;

    public vSquare() {
    }

    public vSquare(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area(){

        return length * length;
    }
}
