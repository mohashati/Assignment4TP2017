package za.ac.cput.oop.OCP.Violate;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class vStudent {

    int SportType;

    String sportPosition;

    public  String Sport()
    {
        if(SportType == 1)
            sportPosition = FootballerPosition();
        else if (SportType == 2)
            sportPosition= RugbyPlayerPosition();

        return sportPosition;
    }

    public String FootballerPosition()
    {
        return "Position is left wing";
    }

    public String RugbyPlayerPosition()
    {
        return "Position is Flanker";
    }
}
