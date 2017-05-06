package za.ac.cput.oop.SRP.Obey;

/**
 * Created by tmoshasha on 04/27/2017.
 */
public class Square implements Area{

    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area(){

        return length * length;
    }
}
