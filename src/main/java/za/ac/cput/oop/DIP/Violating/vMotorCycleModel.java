package za.ac.cput.oop.DIP.Violating;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class vMotorCycleModel implements vPurchase {

    private final double kawa = 3500;
    private final double honda = 9000;
    private final double duca = 50000;
    //double amount;

    public double getDuca() {
        return duca;
    }

    public double getHonda() {
        return honda;
    }

    public double getKawa() {
        return kawa;
    }


    public double Kawasaki(int quantity)
    {
        return quantity * getKawa();
    }

    public double Honda(int quantity)
    {
        return quantity * getHonda();
    }

    public double Ducati(int quantity)
    {
        return quantity * getDuca();
    }

    @Override
    public void EnteringPurchase()
    {
        System.out.println("purchasing motorcycles....");
        System.out.println("Bikes purchased");
    }
}
