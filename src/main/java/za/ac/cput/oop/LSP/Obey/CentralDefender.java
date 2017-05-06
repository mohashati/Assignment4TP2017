package za.ac.cput.oop.LSP.Obey;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class CentralDefender implements FootballPlayer {

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
