package za.ac.cput.oop.ISP.Violating;

/**
 * Created by tmoshasha on 04/27/2017
 */
public class vTopStudent implements vResults{

    @Override
    public Boolean leader()
    {
        System.out.println("IS a great leader");
        return true;
    }

    @Override
    public Boolean participation()
    {
        System.out.println("Always participates");
        return true;
    }

    @Override
    public Boolean TopAssignments()
    {
        System.out.println("Always hands in top quality assignments");
        return true;
    }

    @Override
    public Boolean TopExamResult()
    {
        System.out.println("Has top exam results");
        return true;
    }
}
