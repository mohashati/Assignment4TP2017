package za.ac.cput.oop.LSP.Violate;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class vCentralDefender implements vFootballPlayer {

    @Override
    public Boolean dribbles()
    {
        return true;
    }

    @Override
    public Boolean Saves()
    {
        return true;
    }

    @Override
    public Boolean GoalKicks()
    {
        return true;
    }
}
